public static void checkValid(int date) {
    int year = date / 10000;
    int month = (date / 100) % 100;
    int day = date % 100;
    if (year < 0 && date != Integer.MIN_VALUE) {
      throw new IllegalArgumentException("Date must be year zero or later");
    }
    if (year > 9999 && date != Integer.MAX_VALUE) {
      throw new IllegalArgumentException("Date must be year 9999 or earlier");
    }
    if (month < 1 || month > 12 || day < 1 || day > 31) {
      throw new IllegalArgumentException("Invalid month-day");
    }
    if (day > 29 && VALID_MONTH_DAY[(month - 1) * 2 + (day - 30)] == false) {
      throw new IllegalArgumentException("Invalid month-day");
    }
  }
