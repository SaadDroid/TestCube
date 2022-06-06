@JsonCreator
  public static PrefixRange fromString(String prefixRangeStr) {
    String[] parts = prefixRangeStr.split(":");
    if (parts.length == 1) {
      return fromPrefix(Prefix.parse(parts[0]));
    } else if (parts.length == 2) {
      return new PrefixRange(Prefix.parse(parts[0]), new SubRange(parts[1]));
    } else {
      throw new BatfishException("Invalid PrefixRange string: '" + prefixRangeStr + "'");
    }
  }
