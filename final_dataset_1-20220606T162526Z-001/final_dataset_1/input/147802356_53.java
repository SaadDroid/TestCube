@Override
  public void writeKeys(final BLSKeyPair validatorKey, final BLSKeyPair withdrawalKey)
      throws UncheckedIOException {
    final String yamlLine = getYamlFormattedString(validatorKey, withdrawalKey);
    if (outputPath == null) {
      standardOut.print(yamlLine);
    } else {
      try {
        Files.writeString(
            outputPath,
            yamlLine,
            StandardOpenOption.CREATE,
            StandardOpenOption.WRITE,
            StandardOpenOption.APPEND);
      } catch (IOException e) {
        STATUS_LOG.validatorDepositYamlKeyWriterFailure(outputPath);
        throw new UncheckedIOException(e);
      }
    }
  }
