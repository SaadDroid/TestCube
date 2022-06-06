public static ZonedDateTime getAdjustedDate(final ZonedDateTime date, final int shiftDays, final Calendar calendar) {
    ArgumentChecker.notNull(date, "date");
    ArgumentChecker.notNull(calendar, "calendar");
    ZonedDateTime result = date;
    while (!calendar.isWorkingDay(result.toLocalDate())) {
      result = result.plusDays(1);
    }
    if (shiftDays > 0) {
      for (int loopday = 0; loopday < shiftDays; loopday++) {
        result = result.plusDays(1);
        while (!calendar.isWorkingDay(result.toLocalDate())) {
          result = result.plusDays(1);
        }
      }
    } else {
      for (int loopday = 0; loopday < -shiftDays; loopday++) {
        result = result.minusDays(1);
        while (!calendar.isWorkingDay(result.toLocalDate())) {
          result = result.minusDays(1);
        }
      }
    }
    return result;
  }
