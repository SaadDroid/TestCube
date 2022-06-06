@FromString
  public static GICSCode of(final String code) {
    if (FORMAT.matcher(code).matches() == false) {
      throw new IllegalArgumentException("Invalid code : " + code);
    }
    return new GICSCode(code);
  }
