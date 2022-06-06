@FromString
  public static Country of(String countryCode) {
    ArgumentChecker.notNull(countryCode, "countryCode");
    if (countryCode.matches("[A-Z][A-Z]") == false) {
      throw new IllegalArgumentException("Invalid country code: " + countryCode);
    }
    s_instanceMap.putIfAbsent(countryCode, new Country(countryCode));
    return s_instanceMap.get(countryCode);
  }
