@Nonnull
  public static StandardCommunity parse(String value) {
    String[] parts = value.split(":");
    checkArgument(parts.length <= 2, "Invalid standard community string: %s", value);
    if (parts.length == 2) {
      return of(Integer.parseUnsignedInt(parts[0]), Integer.parseUnsignedInt(parts[1]));
    } else {
      return of(Long.parseUnsignedLong(value));
    }
  }
