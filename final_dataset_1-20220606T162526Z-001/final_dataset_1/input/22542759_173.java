public Object deserialize(Object obj) throws NoSuchFieldException, IllegalAccessException {
    if (fieldTypes.size() == 1) {
      return deserializeField(obj, fieldTypes.get(0), schema);
    } else {
      return flattenRecord(obj, fieldNames, fieldTypes, schema);
    }
  }
