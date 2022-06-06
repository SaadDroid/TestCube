void addFieldByType(XContentBuilder source,
                      String key,
                      String value,
                      Map<String, String> fieldTypeMapping) throws IOException, ParseException {

    String fieldType = fieldTypeMapping.get(FIELD_TYPE);
    if (equalsIgnoreCase(fieldType, "array")) {
      Gson gson = new Gson();
      List list = gson.fromJson(value, List.class);
      source.field(key, list);
    } else if (equalsIgnoreCase(fieldType, "date")) {
      String dateFormat = fieldTypeMapping.get(DATE_FORMAT);
      SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
      source.field(key, sdf.parse(value));
    } else if (equalsIgnoreCase(fieldType, "microseconds")) { // Unix timestamp with microseconds
      double microseconds = Double.parseDouble(value);
      double milliseconds = microseconds * 1000;
      source.field(key, new Date((long) milliseconds));
    } else {
      source.field(key, value);
    }
  }
