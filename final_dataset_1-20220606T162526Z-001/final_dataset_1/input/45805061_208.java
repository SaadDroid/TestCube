@Override
  /**
   * Quarterly expiries along March cycle
   * @param nthFuture nth future
   * @param valDate The date from which to start
   * @return the expiry date of the nth option
   */
  public LocalDate getExpiryDate(int n, LocalDate today, Calendar holidayCalendar) {
    ArgumentChecker.notNegativeOrZero(n, "nth expiry");
    ArgumentChecker.notNull(today, "date");
    ArgumentChecker.notNull(holidayCalendar, "holidayCalendar");

    LocalDate thirdFriday = getThirdFriday(today, holidayCalendar);
    if (today.isAfter(thirdFriday)) { // If it is not on or after valuationDate...
      thirdFriday = getThirdFriday(today.plusMonths(1), holidayCalendar);
    }
    int nQuartersRemaining = QUARTERLY_CYCLE_MONTHS.contains(Month.from(thirdFriday)) ? n - 1 : n;
    if (nQuartersRemaining == 0) {
      return thirdFriday;
    }
    return getQuarterlyExpiry(nQuartersRemaining, thirdFriday, holidayCalendar);
    
  }
