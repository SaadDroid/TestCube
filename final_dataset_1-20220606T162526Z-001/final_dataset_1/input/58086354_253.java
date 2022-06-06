@Deprecated
  public static <T extends MessageLite> Marshaller<T> marshaller(final T defaultInstance) {
    return ProtoLiteUtils.marshaller(defaultInstance);
  }
