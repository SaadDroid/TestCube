@Override
  public String toString() {
    return "Field{" +
      "name='" + fieldType.getName() + '\'' +
      ", type='" + fieldType.getType() + '\'' +
      ", value='" +
      (fieldType.getType() == FieldType.Type.BYTES ? Bytes.toStringBinary((byte[]) value) : value) + '\'' +
      '}';
  }
