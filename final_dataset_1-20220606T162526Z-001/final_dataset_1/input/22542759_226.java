public List<Dag> split() {
    List<Dag> dags = new ArrayList<>();

    Set<String> remainingNodes = new HashSet<>(nodes);
    Set<String> possibleNewSources = Sets.union(sources, connectors.keySet());
    Set<String> possibleNewSinks = Sets.union(sinks, connectors.keySet());
    for (String reduceNode : reduceNodes) {
      Dag subdag = subsetAround(reduceNode, possibleNewSources, possibleNewSinks);
      // remove all non-connector sinks from remaining nodes.
      // connectors will be a source in one subdag and a sink in another subdag,
      // so they will all eventually be removed as a source, or will end up in remainingSources down below
      Set<String> subdagConnectorSinks = Sets.intersection(subdag.getSinks(), connectors.keySet());
      remainingNodes.removeAll(Sets.difference(subdag.getNodes(), subdagConnectorSinks));
      dags.add(subdag);
    }

    Set<String> remainingSources = new TreeSet<>(Sets.intersection(remainingNodes, possibleNewSources));

    /* Since there can be remaining sources from subdags which don't overlap, they should be split as seperate subdags.
     For example:

             n1 --|
                  |--- n3(r) ---|
             n2 --|             |-- n5(c) --- n5(r) --|
                    n4 ---------|                     |
                                                      |--- n7(c) --- n7(r) --- n8
                                                      |
                                          n6 ---------|
                                                      |
                                          n9 ---------|

      Here, remainingSources are n4, n6 and n9.

      Now, n6, n9, n7.connector should be in the same subdag and n4, n5.connector should be another subdag. So, the
      algorithm will first create dag1(n4, n5.connector), dag2(n6, n7.connector) and dag3(n9, n7.connector) and
      then it will merge dag2 and dag3 into (n6, n9, n7.connector) because they have n7.connector in common, and will
      keep (n4, n5.connector) as a separate dag since it does not overlap with nodes from dag2 and dag3.
    */

    // For that, we first create all the subdags from remaining sources and keep track of accessible nodes for those
    // subdags. source -> [ nodes accessible by the source ]
    Map<String, Dag> remainingDags = new HashMap<>();
    for (String remainingSource : remainingSources) {
      remainingDags.put(remainingSource, subsetFrom(remainingSource, possibleNewSinks));
    }

    // Then we merge overlapping subdags.
    Set<String> processedSources = new HashSet<>();
    for (String remainingSource : remainingSources) {
      // Skip remainingSource if it has already been added to a dag.
      if (!processedSources.add(remainingSource)) {
        continue;
      }

      Dag subdag = remainingDags.get(remainingSource);
      // Don't count the sources when looking for subdag overlap.
      // This is to prevent a subdag with a connector as a sink
      // and another subdag with that same connector as a source from getting merged
      Set<String> subdagNodes = new HashSet<>(subdag.getNodes());
      Set<String> nonSourceNodes = Sets.difference(subdagNodes, subdag.getSources());
      // go through all the other remaining sources and see if there is a path from them to our current dag
      Set<String> otherSources = Sets.difference(remainingSources, processedSources);
      // keep looping until no new nodes were added to the subdag.
      boolean nodesAdded;
      do {
        nodesAdded = false;
        for (String otherSource : otherSources) {
          Dag otherSubdag = remainingDags.get(otherSource);
          // If there is a path from the other source to our current dag, add those nodes to our current dag
          Set<String> otherNonSourceNodes = Sets.difference(otherSubdag.getNodes(), otherSubdag.getSources());
          // Don't count the sources when looking for subdag overlap.
          // This is to prevent a subdag with a connector as a sink
          // and another subdag with that same connector as a source from getting merged
          if (!Sets.intersection(nonSourceNodes, otherNonSourceNodes).isEmpty()) {
            if (subdagNodes.addAll(otherSubdag.getNodes())) {
              nodesAdded = true;
            }
          }
        }
      } while (nodesAdded);
      Dag mergedSubdag = createSubDag(subdagNodes);
      dags.add(mergedSubdag);
      // keep track of processed nodes
      processedSources.addAll(mergedSubdag.getSources());
    }
    return dags;
  }
