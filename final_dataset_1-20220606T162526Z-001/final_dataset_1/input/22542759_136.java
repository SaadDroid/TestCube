@Override
  public StructuredRecord read(ByteBuffer input) throws UnexpectedFormatException {
    String bodyAsStr = Bytes.toString(input, StandardCharsets.UTF_8);
    StructuredRecord.Builder builder = StructuredRecord.builder(schema);
    List<String> parts = getLogEntries(bodyAsStr);
    List<Schema.Field> fields = schema.getFields();
    int index = 0;
    while (index < fields.size()) {
      Schema.Field field = fields.get(index);
      String val = (parts.size() < index || (parts.get(index).equals("-") &&
                                             field.getSchema().getType() != Schema.Type.STRING))
                    ? null : parts.get(index);
      builder.convertAndSet(field.getName(), val);
      index++;
    }

    return builder.build();
  }
