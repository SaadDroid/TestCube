@Override
  public LocalDate getExpiryDate(final int n, final LocalDate today, final Calendar holidayCalendar) {
    ArgumentChecker.isTrue(n > 0, "n must be greater than zero");
    ArgumentChecker.notNull(today, "today");
    ArgumentChecker.notNull(holidayCalendar, "holiday calendar");
    final LocalDate nextExpiryMonth = today.with(MONTH_ADJUSTER);
    LocalDate result;
    if (!today.getMonth().equals(nextExpiryMonth.getMonth())) { // In a quarterly month
      result = nextExpiryMonth.plusMonths(3 * (n - 1)).with(THIRD_WEDNESDAY_ADJUSTER);
    } else {
      final LocalDate thirdWednesday = today.with(THIRD_WEDNESDAY_ADJUSTER);
      if (today.isAfter(adjustForSettlement(thirdWednesday, holidayCalendar))) {
        result = nextExpiryMonth.plusMonths(3 * n).with(THIRD_WEDNESDAY_ADJUSTER);
      } else {
        result = nextExpiryMonth.plusMonths(3 * (n - 1)).with(THIRD_WEDNESDAY_ADJUSTER);
      }
    }
    return adjustForSettlement(result, holidayCalendar);
  }
