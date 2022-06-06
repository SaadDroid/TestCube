public static CodecFactory getCodecFactory(Optional<String> codecName, Optional<String> deflateLevel) {
    if (!codecName.isPresent()) {
      return CodecFactory.deflateCodec(ConfigurationKeys.DEFAULT_DEFLATE_LEVEL);
    } else if (codecName.get().equalsIgnoreCase(DataFileConstants.DEFLATE_CODEC)) {
      if (!deflateLevel.isPresent()) {
        return CodecFactory.deflateCodec(ConfigurationKeys.DEFAULT_DEFLATE_LEVEL);
      }
      return CodecFactory.deflateCodec(Integer.parseInt(deflateLevel.get()));
    } else {
      return CodecFactory.fromString(codecName.get().toLowerCase());
    }
  }
