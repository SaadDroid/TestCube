@Override
  protected void process(LogRecord record) {
    String arrayJson = record.getValue(arrayField);
    Gson gson = new Gson();
    List list = gson.fromJson(arrayJson, List.class);
    List decomposeList = new ArrayList<>();

    if(list != null) {
      for (Object object : list) {
        Map map = (Map) object;
        decomposeList.add(map.get(objectField));
      }
    }

    String json = new Gson().toJson(decomposeList);
    record.setValue(destField, json);
  }
