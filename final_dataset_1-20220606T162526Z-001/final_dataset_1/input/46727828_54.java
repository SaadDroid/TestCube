void validateDateFormat() throws ConfigurationException {
    try {
      new SimpleDateFormat(dateFormat);
    } catch (IllegalArgumentException e) {
      logger.error("Bad date format {}", dateFormat);
      throw new ConfigurationException(e);
    }
  }
