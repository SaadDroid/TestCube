public static boolean isIndexRollDate(final LocalDate date) {
    if (date.getDayOfMonth() != IMM_DAY) {
      return false;
    }
    final int month = date.getMonthValue();
    return month == INDEX_ROLL_MONTHS[0] || month == INDEX_ROLL_MONTHS[1];
  }
