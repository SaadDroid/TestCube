public static long fileNameToPersistenceTime(String fileName) {
    if (StringUtils.isBlank(fileName)) {
      throw new IllegalArgumentException("the 'fileName' cannot be 'null' or empty");
    }
    String formattedTimeString = StringUtils.strip(fileName, FILE_FORMAT_EXTENSION);
    DateTime persistedTime = FILE_FORMATTER.parseDateTime(formattedTimeString);
    return persistedTime.getMillis();
  }
