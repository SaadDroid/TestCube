@Override public void validate(Metadata<DTOJson> metadata, Object candidate) throws AssertionError {
    if (candidate == null) {
      dtoMockery.validate(DTOMetadata(metadata), candidate);
    }

    Metadata<DTO> dtoMetadata = DTOMetadata(metadata);
    Type type = dtoMockery.supportedTypes(dtoMetadata)[0];

    String json = (String) candidate;
    JolyglotGenerics jolyglot = jolyglot(metadata);

    Object object;

    try {
      object = jolyglot.fromJson(json, type);
    } catch (RuntimeException e) {
      object = null;
    }

    dtoMockery.validate(DTOMetadata(metadata), object);
  }
