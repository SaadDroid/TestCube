@FromString
  public static ExternalScheme of(final String name) {
    ArgumentChecker.notEmpty(name, "name");
    return s_cache.getUnchecked(name);
  }
