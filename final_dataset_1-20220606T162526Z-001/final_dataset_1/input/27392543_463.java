@Override
  public Iterable<RecordWithMetadata<byte[]>> convertRecord(String outputSchema, RecordWithMetadata<?> inputRecord,
      WorkUnitState workUnit)
      throws DataConversionException {

    try {
      updateRecordMetadata(inputRecord);

      ByteArrayOutputStream bOs = new ByteArrayOutputStream(512);
      try (JsonGenerator generator = jsonFactory.createJsonGenerator(bOs, JsonEncoding.UTF8).setCodec(objectMapper)) {
        generator.writeStartObject();

        writeHeaders(inputRecord, generator);
        writeRecord(inputRecord, generator);

        generator.writeEndObject();
      }

      return Collections.singleton(new RecordWithMetadata<byte[]>(bOs.toByteArray(), inputRecord.getMetadata()));
    } catch (IOException e) {
      throw new DataConversionException(e);
    }
  }
