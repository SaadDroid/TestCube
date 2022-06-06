public void refresh() {
        logger.debug("Refreshing sync state...");
        long nextLastRefreshAt = System.currentTimeMillis();

        try {
            if (lastRefreshAt == -1) {
                logger.debug("Initial synchronization");
                deployDomains();
                deployClients();
                deployCertificates();
            } else {
                // search for events and compute them
                logger.debug("Events synchronization");
                List<Event> events = eventRepository.findByTimeFrame(lastRefreshAt - lastDelay, nextLastRefreshAt).blockingGet();

                if (events != null && !events.isEmpty()) {
                    // Extract only the latest events by type and id
                    Map<AbstractMap.SimpleEntry, Event> sortedEvents = events
                            .stream()
                            .collect(
                                    toMap(
                                            event -> new AbstractMap.SimpleEntry<>(event.getType(), event.getPayload().getId()),
                                            event -> event, BinaryOperator.maxBy(comparing(Event::getCreatedAt)), LinkedHashMap::new));
                    computeEvents(sortedEvents.values());
                }

            }
            lastRefreshAt = nextLastRefreshAt;
            lastDelay = System.currentTimeMillis() - nextLastRefreshAt;
        } catch (Exception ex) {
            logger.error("An error occurs while synchronizing the security domains", ex);
        }
    }
