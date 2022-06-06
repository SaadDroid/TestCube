public Handler getHandler(Service service, Driver.Serialization serialization) {
    switch (serialization) {
    case JSON:
      return new AvaticaHandler(service);
    case PROTOBUF:
      return new AvaticaProtobufHandler(service);
    default:
      throw new IllegalArgumentException("Unknown Avatica handler for " + serialization.name());
    }
  }
