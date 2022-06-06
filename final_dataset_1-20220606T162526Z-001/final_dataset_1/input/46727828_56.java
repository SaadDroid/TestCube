void logDate(LogRecord record) {
    Date date = record.getDate();
    if (date == null) {
      logger.error("Record date is null!");
    } else {
      SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
      sdf.setTimeZone(TimeZone.getTimeZone(ZoneId.of("UTC")));
      super.log(logger, sdf.format(date));
    }
  }
