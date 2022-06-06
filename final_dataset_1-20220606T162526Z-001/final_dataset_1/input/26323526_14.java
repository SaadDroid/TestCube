@Override
  public EPGMVertex map(String jsonString) throws Exception {
    JSONObject jsonVertex = new JSONObject(jsonString);

    Properties properties = reuse.getProperties();
    if (properties == null) {
      properties = Properties.create();
      reuse.setProperties(properties);
    }
    properties.clear();

    for (Iterator it = jsonVertex.keys(); it.hasNext();) {
      String key = (String) it.next();

      PropertyValue propertyValue = getPropertyValue(jsonVertex, key);
      properties.set(key, propertyValue);
    }
    return reuse;
  }
