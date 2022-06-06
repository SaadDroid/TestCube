void populateMutation(Mutation mut, String columnFamily, ColumnVisibility vis, Map<String, String> fields) {
    for (Map.Entry<String, String> entry : fields.entrySet()) {
      String key = defaultString(entry.getKey());
      String value = defaultString(entry.getValue());

      mut.put(columnFamily, key, vis, new Value(value.getBytes()));
    }
  }
