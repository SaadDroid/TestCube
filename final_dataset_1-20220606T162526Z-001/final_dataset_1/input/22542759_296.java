public TransformResponse runOneIteration(IN input) throws Exception {
    for (String stageName : startingPoints) {
      // no prevStage for starting points
      executeTransformation(stageName, ImmutableList.of(input));
    }

    Map<String, Collection<Object>> terminalNodeEntriesMap = new HashMap<>();
    Map<String, Collection<InvalidEntry<Object>>> errors = new HashMap<>();

    for (Map.Entry<String, TransformDetail> transformDetailEntry : transformDetailMap.entrySet()) {
      if (transformDetailEntry.getValue().getNextStages().isEmpty()) {
        // terminal node
        Collection<Object> entries = transformDetailEntry.getValue().getEntries();
        if (entries != null) {
          terminalNodeEntriesMap.put(transformDetailEntry.getKey(), entries);
        }
      }

      if (!transformDetailEntry.getValue().getErrors().isEmpty()) {
        errors.put(transformDetailEntry.getKey(), transformDetailEntry.getValue().getErrors());
      }
    }
    return new TransformResponse(terminalNodeEntriesMap, errors);
  }
