@SuppressWarnings("unchecked")
  public <T> ResultConverter<? super T> getConverter(T value) {
    ResultConverter<?> converter = findConverterForType(value.getClass());
    if (converter == null) {
      throw new IllegalArgumentException("No converter found for " + value.getClass());
    }
    return (ResultConverter<? super T>) converter; 
  }
