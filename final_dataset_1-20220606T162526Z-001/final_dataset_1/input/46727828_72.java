void parseJson(String jsonString, LogRecord logRecord) {
    String cleanedJsonString = IngestUtilities.removeUnprintableCharacters(jsonString);
    Config cfg = ConfigFactory.parseString(cleanedJsonString);
    for (Map.Entry<String, ConfigValue> entry : cfg.entrySet()) {
      String key = entry.getKey();
      ConfigValue value = entry.getValue();
      switch (value.valueType()) {
        case BOOLEAN:
        case NUMBER:
        case OBJECT:
        case STRING:
          logRecord.setValue(key, ObjectUtils.toString(value.unwrapped()));
          break;
        case LIST:
          ConfigList list = (ConfigList) value;
          Gson gson = new Gson();
          String json = gson.toJson(list.unwrapped());
          logRecord.setValue(key, json);
          break;
        case NULL:
        default:
          // skip
      }
    }
  }
