@Override
  public Pair<String, Boolean> process(OMUpdateEventBatch events) {
    Iterator<OMDBUpdateEvent> eventIterator = events.getIterator();

    HashMap<String, Long> objectCountMap = initializeCountMap();

    while (eventIterator.hasNext()) {
      OMDBUpdateEvent<String, Object> omdbUpdateEvent = eventIterator.next();
      String rowKey = getRowKeyFromTable(omdbUpdateEvent.getTable());
      try{
        switch (omdbUpdateEvent.getAction()) {
        case PUT:
          objectCountMap.computeIfPresent(rowKey, (k, count) -> count + 1L);
          break;

        case DELETE:
          // if value is null, it means that the volume / bucket / key
          // is already deleted and does not exist in the OM database anymore.
          if (omdbUpdateEvent.getValue() != null) {
            String key = getRowKeyFromTable(omdbUpdateEvent.getTable());
            objectCountMap.computeIfPresent(key,
                (k, count) -> count > 0 ? count - 1L : 0L);
          }
          break;

        default: LOG.trace("Skipping DB update event : Table: {}, Action: {}",
            omdbUpdateEvent.getTable(), omdbUpdateEvent.getAction());
        }
      } catch (Exception e) {
        LOG.error("Unexpected exception while processing the table {}, " +
                "Action: {}", omdbUpdateEvent.getTable(),
            omdbUpdateEvent.getAction(), e);
        return new ImmutablePair<>(getTaskName(), false);
      }
    }
    for (Entry<String, Long> entry: objectCountMap.entrySet()) {
      ReconUtils.upsertGlobalStatsTable(sqlConfiguration, globalStatsDao,
          entry.getKey(),
          entry.getValue());
    }

    LOG.info("Completed a 'process' run of TableCountTask.");
    return new ImmutablePair<>(getTaskName(), true);
  }
