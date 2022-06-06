public static double[] getIntegrationNodesAsTimes(final LocalDate today, final LocalDate startDate, final LocalDate endDate, final LocalDate[] disCurveDates, final LocalDate[] spreadCurveDates) {

    ArgumentChecker.notNull(today, "null today");
    ArgumentChecker.notNull(startDate, "null startDate");
    ArgumentChecker.isFalse(today.isAfter(startDate), "today is after startDate");

    final LocalDate[] dates = getIntegrationNodesAsDates(startDate, endDate, disCurveDates, spreadCurveDates);
    return getYearFractionFromToday(today, dates);
  }
