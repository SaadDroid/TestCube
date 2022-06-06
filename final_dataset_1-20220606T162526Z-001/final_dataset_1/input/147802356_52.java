@Override
  public Bytes32 convert(final String value) {
    byte[] input = value.getBytes(StandardCharsets.UTF_8);
    if (input.length > 32) {
      throw (new CommandLine.TypeConversionException(
          "'"
              + value
              + "' converts to "
              + input.length
              + " bytes. A maximum of 32 bytes can be used as graffiti."));
    }

    byte[] bytes = new byte[32];
    System.arraycopy(input, 0, bytes, 0, input.length);
    return Bytes32.wrap(bytes);
  }
