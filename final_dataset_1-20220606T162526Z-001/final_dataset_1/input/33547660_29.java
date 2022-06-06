public DatatypeBuilder createDatatypeBuilder(String localName) throws DatatypeException {
    DatatypeBase base = typeMap.get(localName);
    if (base == null)
      throw new DatatypeException();
    if (base instanceof RegexDatatype) {
      try {
        ((RegexDatatype)base).compile(getRegexEngine());
      }
      catch (RegexSyntaxException e) {
        throw new DatatypeException(DatatypeBuilderImpl.localizer.message("regex_internal_error", localName));
      }
    }
    return new DatatypeBuilderImpl(this, base);
  }
