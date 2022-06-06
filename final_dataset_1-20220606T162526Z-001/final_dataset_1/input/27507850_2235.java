public static void checkClientArgument(
      boolean precondition, @Nonnull String format, @Nonnull Object... args) {
    if (!precondition) {
      throw new BadRequestException(String.format(format, args));
    }
  }
