public Optional<Parameter.Converter[]> resolveConverters(
      final Method testMethod, final Example.Builder example) {
    final Optional<Parameter.Converter>[] defaultConverters =
        this.defaultConverterExtractor.extract(example.getSchema());
    final Optional<Parameter.Converter>[] customConverters =
        this.customConverterExtractor.extract(testMethod);

    if (defaultConverters.length != customConverters.length) {
      LOGGER.error(
          "The size of the default converters ({}) and custom converters ({}) does not match for {} in {}.",
          defaultConverters.length,
          customConverters.length,
          testMethod.getName(),
          testMethod.getDeclaringClass());
      return Optional.empty();
    }

    return Optional.of(
        IntStream.range(0, defaultConverters.length)
            .sequential()
            .filter(i -> customConverters[i].isPresent() || defaultConverters[i].isPresent())
            .mapToObj(i -> customConverters[i].orElseGet(() -> defaultConverters[i].get()))
            .toArray(Parameter.Converter[]::new));
  }
