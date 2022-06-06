@Nullable
  public String parse(@Nullable String str) throws InvalidMacroException {
    if (str == null) {
      return null;
    }
    // final string should have escapes that are not directly embedded in macro syntax replaced
    return replaceEscapedSyntax(parse(str, 0));
  }
