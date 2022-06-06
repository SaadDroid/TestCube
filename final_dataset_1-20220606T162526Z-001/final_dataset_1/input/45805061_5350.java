public static int convertToInt(LocalDate date) {
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfMonth();
    if (year > 9999) {
      if (date.equals(LocalDate.MAX)) {
        return Integer.MAX_VALUE;
      }
      throw new IllegalArgumentException("LocalDate has year > 9999");
    }
    if (year < 0) {
      if (date.equals(LocalDate.MIN)) {
        return Integer.MIN_VALUE;
      }
      throw new IllegalArgumentException("LocalDate has year < 0");
    }
    return year * 10000 + month * 100 + day;
  }
