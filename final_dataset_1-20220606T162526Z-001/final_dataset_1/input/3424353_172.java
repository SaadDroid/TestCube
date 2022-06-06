public void generateStopNarratives(NarrativeProviderImpl provider) {

    Map<AgencyAndId, List<ProjectedPoint>> shapePointCache = new HashMap<AgencyAndId, List<ProjectedPoint>>();

    int index = 0;

    Collection<Stop> allStops = _gtfsDao.getAllStops();
    Map<AgencyAndId, Stop> stopsById = MappingLibrary.mapToValue(allStops, "id");
    int logInterval = LoggingIntervalUtil.getAppropriateLoggingInterval(allStops.size());

    for (StopEntry stopEntry : _transitGraphDao.getAllStops()) {

      if (index % logInterval == 0)
        _log.info("stops=" + index);
      index++;

      Stop stop = stopsById.get(stopEntry.getId());

      StopNarrative.Builder narrative = StopNarrative.builder();
      narrative.setCode(deduplicate(stop.getCode()));
      narrative.setDescription(deduplicate(stop.getDesc()));
      narrative.setName(deduplicate(stop.getName()));
      narrative.setUrl(deduplicate(stop.getUrl()));

      String direction = computeStopDirection(provider, shapePointCache, stop,
          stopEntry);
      narrative.setDirection(deduplicate(direction));

      provider.setNarrativeForStop(stopEntry.getId(), narrative.create());
    }
  }
