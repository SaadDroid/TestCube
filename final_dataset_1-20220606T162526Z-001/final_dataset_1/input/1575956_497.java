@Override
    public ClusterAssignmentData computeIdealState(ClusterMetadata clusterMetadata,
                                                   ClusterAssignmentData currentState,
                                                   Set<BookieId> currentCluster) {

        if (currentCluster.isEmpty()) {
            log.info("Current cluster is empty. No alive server is found.");
            return currentState;
        }

        // 1. get current server assignments
        Map<BookieId, Set<Long>> currentServerAssignments;
        try {
            currentServerAssignments = currentState.getServersMap()
                .entrySet()
                .stream()
                .collect(Collectors.toMap(e1 -> {
                        return BookieId.parse(e1.getKey());
                    },
                    e2 -> e2.getValue().getContainersList().stream().collect(Collectors.toSet())
                ));
        } catch (UncheckedExecutionException uee) {
            log.warn("Invalid cluster assignment data is found : {} - {}. Recompute assignment from empty state",
                currentState, uee.getCause().getMessage());
            currentServerAssignments = Maps.newHashMap();
        }
        Set<BookieId> currentServersAssigned = currentServerAssignments.keySet();

        // 2. if no servers is assigned, initialize the ideal state
        if (currentServersAssigned.isEmpty()) {
            return initializeIdealState(clusterMetadata, currentCluster);
        }

        // 3. get the cluster diffs
        Set<BookieId> serversAdded =
            Sets.difference(currentCluster, currentServersAssigned).immutableCopy();
        Set<BookieId> serversRemoved =
            Sets.difference(currentServersAssigned, currentCluster).immutableCopy();

        if (serversAdded.isEmpty() && serversRemoved.isEmpty()) {
            // cluster is unchanged, assuming the current state is ideal, no re-assignment is required.
            return currentState;
        }

        log.info("Storage container controller detects cluster changed:\n"
                + "\t {} servers added: {}\n\t {} servers removed: {}",
            serversAdded.size(), serversAdded, serversRemoved.size(), serversRemoved);

        // 4. compute the containers that owned by servers removed. these containers are needed to be reassigned.
        Set<Long> containersToReassign = currentServerAssignments.entrySet().stream()
            .filter(serverEntry -> !currentCluster.contains(serverEntry.getKey()))
            .flatMap(serverEntry -> serverEntry.getValue().stream())
            .collect(Collectors.toSet());

        // 5. use an ordered set as priority deque to sort the servers by the number of assigned containers
        TreeSet<Pair<BookieId, LinkedList<Long>>> assignmentQueue =
            new TreeSet<>(new ServerAssignmentDataComparator());
        for (Map.Entry<BookieId, Set<Long>> entry : currentServerAssignments.entrySet()) {
            BookieId host = entry.getKey();

            if (!currentCluster.contains(host)) {
                if (log.isTraceEnabled()) {
                    log.trace("Host {} is not in current cluster anymore", host);
                }
                continue;
            } else {
                if (log.isTraceEnabled()) {
                    log.trace("Adding host {} to assignment queue", host);
                }
                assignmentQueue.add(Pair.of(host, Lists.newLinkedList(entry.getValue())));
            }
        }

        // 6. add new servers
        for (BookieId server : serversAdded) {
            assignmentQueue.add(Pair.of(server, Lists.newLinkedList()));
        }

        // 7. assign the containers that are needed to be reassigned.
        for (Long containerId : containersToReassign) {
            Pair<BookieId, LinkedList<Long>> leastLoadedServer = assignmentQueue.pollFirst();
            leastLoadedServer.getValue().add(containerId);
            assignmentQueue.add(leastLoadedServer);
        }

        // 8. rebalance the containers if needed
        int diffAllowed;
        if (assignmentQueue.size() > clusterMetadata.getNumStorageContainers()) {
            diffAllowed = 1;
        } else {
            diffAllowed = clusterMetadata.getNumStorageContainers() % assignmentQueue.size() == 0 ? 0 : 1;
        }

        Pair<BookieId, LinkedList<Long>> leastLoaded = assignmentQueue.first();
        Pair<BookieId, LinkedList<Long>> mostLoaded = assignmentQueue.last();
        while (mostLoaded.getValue().size() - leastLoaded.getValue().size() > diffAllowed) {
            leastLoaded = assignmentQueue.pollFirst();
            mostLoaded = assignmentQueue.pollLast();

            // move container from mostLoaded to leastLoaded
            Long containerId = mostLoaded.getValue().removeFirst();
            // add the container to the end to avoid balancing this container again.
            leastLoaded.getValue().addLast(containerId);

            assignmentQueue.add(leastLoaded);
            assignmentQueue.add(mostLoaded);

            leastLoaded = assignmentQueue.first();
            mostLoaded = assignmentQueue.last();
        }

        // 9. the new ideal state is computed, finalize it
        Map<String, ServerAssignmentData> newAssignmentMap = Maps.newHashMap();
        assignmentQueue.forEach(assignment -> newAssignmentMap.put(
            assignment.getKey().toString(),
            ServerAssignmentData.newBuilder()
                .addAllContainers(assignment.getValue())
                .build()));
        return ClusterAssignmentData.newBuilder()
            .putAllServers(newAssignmentMap)
            .build();
    }
