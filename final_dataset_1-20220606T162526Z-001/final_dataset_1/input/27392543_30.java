private static Object getObjectFromMap(Map map, String key) {
    Utf8 utf8Key = new Utf8(key);
    Object value = map.get(utf8Key);
    if (value == null) {
      return map.get(key);
    }

    return value;
  }
