public YieldConvention getYieldConvention(final String name) {
    try {
      return instance(name);
    } catch (final IllegalArgumentException ex) {
      ArgumentChecker.notNull(name, "name");
      final YieldConvention yc = new SimpleYieldConvention(name.toUpperCase(Locale.ENGLISH));
      return addInstance(yc);
    }
  }
