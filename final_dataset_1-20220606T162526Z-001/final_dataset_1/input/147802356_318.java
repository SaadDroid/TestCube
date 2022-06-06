@SuppressWarnings("unchecked")
  public static <T extends Throwable> Optional<T> getCause(
      final Throwable err, Class<T> targetType) {
    return ExceptionUtils.getThrowableList(err).stream()
        .filter(targetType::isInstance)
        .map(e -> (T) e)
        .findFirst();
  }
