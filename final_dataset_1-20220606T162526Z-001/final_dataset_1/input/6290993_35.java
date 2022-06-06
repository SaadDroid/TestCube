public static byte[] serialize(ConsumerRecord<BytesWritable, BytesWritable> record) throws IOException {
    if (record == null)
      throw new IllegalArgumentException("record cannot be null");

    ByteArrayOutputStream byteOut = new ByteArrayOutputStream();

    try (DataOutputStream dataOut = new DataOutputStream(byteOut)) {
      dataOut.writeUTF(record.topic());
      dataOut.writeInt(record.partition());
      dataOut.writeLong(record.offset());
      dataOut.writeLong(record.timestamp());
      dataOut.writeUTF(record.timestampType().name);
      dataOut.writeLong(record.checksum());
      dataOut.writeInt(record.serializedKeySize());
      dataOut.writeInt(record.serializedValueSize());

      if (record.key() == null) {
        dataOut.writeInt(-1);
      } else {
        byte[] keyBytes = record.key().getBytes();
        dataOut.writeInt(keyBytes.length);
        dataOut.write(keyBytes);
      }

      if (record.value() == null) {
        dataOut.writeInt(-1);
      } else {
        byte[] valueBytes = record.value().getBytes();
        dataOut.writeInt(valueBytes.length);
        dataOut.write(valueBytes);
      }

      return byteOut.toByteArray();
    }
  }
