@Override
  protected void process(LogRecord record) {
    for (Map.Entry<String, String> entry : srcDestFieldMapping.entrySet()) {
      final String src = record.getValue(entry.getKey());

      String reversedArrayJson = reverseJsonArray(src);
      record.setValue(entry.getValue(), reversedArrayJson);
    }
  }
