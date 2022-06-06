@Override
  public <T> RpcByteBufDecoder<T> createDecoder(Class<T> payloadType) {
    if (payloadType.equals(EmptyMessage.class)) {
      return getEmptyMessageDecoder();
    } else {
      return new LengthPrefixedPayloadDecoder<>(
          payloadEncoders.getEncoder(payloadType), compressor);
    }
  }
