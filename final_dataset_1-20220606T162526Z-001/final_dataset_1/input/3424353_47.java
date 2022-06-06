@Cacheable
  @Override
  public Set<Date> getDatesForServiceIds(ServiceIdActivation serviceIds) {

    Set<Date> serviceDates = null;

    List<LocalizedServiceId> activeServiceIds = serviceIds.getActiveServiceIds();
    List<LocalizedServiceId> inactiveServiceIds = serviceIds.getInactiveServiceIds();

    for (LocalizedServiceId activeServiceId : activeServiceIds) {

      List<Date> dates = _calendarService.getDatesForLocalizedServiceId(activeServiceId);
      if (dates.isEmpty())
        return Collections.emptySet();
      if (serviceDates == null)
        serviceDates = new HashSet<Date>(dates);
      else
        serviceDates.retainAll(dates);
      if (serviceDates.isEmpty())
        return Collections.emptySet();
    }

    for (LocalizedServiceId inactiveServiceId : inactiveServiceIds) {
      List<Date> dates = _calendarService.getDatesForLocalizedServiceId(inactiveServiceId);
      serviceDates.removeAll(dates);
    }

    return serviceDates;
  }
