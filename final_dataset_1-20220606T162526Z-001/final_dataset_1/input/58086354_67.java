public static <T extends MessageLite> Marshaller<T> marshaller(final T defaultInstance) {
    @SuppressWarnings("unchecked")
    final Parser<T> parser = (Parser<T>) defaultInstance.getParserForType();
    return new Marshaller<T>() {
      @Override
      public InputStream stream(T value) {
        return new ProtoInputStream(value, parser);
      }

      @Override
      public T parse(InputStream stream) {
        if (stream instanceof ProtoInputStream) {
          ProtoInputStream protoStream = (ProtoInputStream) stream;
          // Optimization for in-memory transport. Returning provided object is safe since protobufs
          // are immutable.
          //
          // However, we can't assume the types match, so we have to verify the parser matches.
          // Today the parser is always the same for a given proto, but that isn't guaranteed. Even
          // if not, using the same MethodDescriptor would ensure the parser matches and permit us
          // to enable this optimization.
          if (protoStream.parser() == parser) {
            try {
              @SuppressWarnings("unchecked")
              T message = (T) ((ProtoInputStream) stream).message();
              return message;
            } catch (IllegalStateException ex) {
              // Stream must have been read from, which is a strange state. Since the point of this
              // optimization is to be transparent, instead of throwing an error we'll continue,
              // even though it seems likely there's a bug.
            }
          }
        }
        try {
          return parseFrom(stream);
        } catch (InvalidProtocolBufferException ipbe) {
          throw Status.INTERNAL.withDescription("Invalid protobuf byte sequence")
            .withCause(ipbe).asRuntimeException();
        }
      }

      private T parseFrom(InputStream stream) throws InvalidProtocolBufferException {
        // Pre-create the CodedInputStream so that we can remove the size limit restriction
        // when parsing.
        CodedInputStream codedInput = CodedInputStream.newInstance(stream);
        codedInput.setSizeLimit(Integer.MAX_VALUE);

        T message = parser.parseFrom(codedInput, globalRegistry);
        try {
          codedInput.checkLastTagWas(0);
          return message;
        } catch (InvalidProtocolBufferException e) {
          e.setUnfinishedMessage(message);
          throw e;
        }
      }
    };
  }
