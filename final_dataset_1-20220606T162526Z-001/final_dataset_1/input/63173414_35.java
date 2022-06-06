@Override public Object illegal(Metadata<Enum> metadata) {
    throwExceptionOnEmptyArray(metadata);

    String defaultOptional = metadata.getAnnotation().illegal();
    Type type = metadata.getType();

    if (!defaultOptional.isEmpty()) {
      return safetyCast.with(defaultOptional, metadata.getType());
    } else if (type.equals(String.class)) {
      return safetyCast.with("", type);
    } else {
      return safetyCast.with(0, type);
    }
  }
