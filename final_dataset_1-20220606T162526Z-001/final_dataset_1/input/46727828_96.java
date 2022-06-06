void configureTimeSeriesIndex(Configuration timeSeriesIndexNameConfig) {
    if (!timeSeriesIndexNameConfig.isEmpty()) {
      timeSeriesIndexFieldName = timeSeriesIndexNameConfig.getString(FIELD_NAME);
      timeSeriesIndexInputDateFormat = timeSeriesIndexNameConfig.getString(INPUT_DATE_FORMAT);
      timeSeriesIndexOutputDateFormat = timeSeriesIndexNameConfig.getString(POSTFIX_DATE_FORMAT);
    }
  }
