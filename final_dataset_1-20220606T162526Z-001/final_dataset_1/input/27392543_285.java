@Override
  public Map<String, Object> getMultiGeneric(String fieldName) {
    Map<String, Object> vals = AvroUtils.getMultiFieldValue(record, fieldName);
    for (Map.Entry<String, Object> entry: vals.entrySet()) {
      vals.put(entry.getKey(), convertAvroToJava(entry.getKey(), entry.getValue()));
    }

    return vals;
  }
