public Map<Integer, List<OpeningHours>> openingHours() {
        return
        Arrays.stream(DayOfWeek.values())
              .map(dow -> {
                  Query<EntityHandle<WorkingHoursChanged>> scope = QueryFactory.and(equal(WorkingHoursChanged
                                                                                              .REFERENCE_ID, getId()),
                                                                                  equal(WorkingHoursChanged.DAY_OF_WEEK, dow));
                  Query<EntityHandle<WorkingHoursChanged>> query =
                          scoped(scope, max(WorkingHoursChanged.TIMESTAMP));
                  try (ResultSet<EntityHandle<WorkingHoursChanged>> resultSet =
                               getRepository().query(WorkingHoursChanged.class, query)) {
                      return resultSet.uniqueResult().get();
                  }
                  })
                .collect(Collectors.toMap(e -> e.dayOfWeek().getValue(), WorkingHoursChanged::openDuring));
    }
