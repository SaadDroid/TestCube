public Put toPut(StructuredRecord record) {
    Schema recordSchema = record.getSchema();
    Preconditions.checkArgument(recordSchema.getType() == Schema.Type.RECORD, "input must be a record.");

    Schema.Field keyField = getKeyField(recordSchema);
    Preconditions.checkArgument(keyField != null, "Could not find key field in record.");

    Put output = createPut(record, keyField);

    for (Schema.Field field : recordSchema.getFields()) {
      if (field.getName().equals(keyField.getName())) {
        continue;
      }

      // Skip fields that are not present in the Output Schema
      if (outputSchema != null && outputSchema.getField(field.getName()) == null) {
        continue;
      }
      setField(output, field, record.get(field.getName()));
    }
    return output;
  }
