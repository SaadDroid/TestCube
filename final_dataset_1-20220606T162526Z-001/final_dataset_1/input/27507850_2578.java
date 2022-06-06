@JsonCreator
  @Nonnull
  public static RegexConstraint parse(@Nonnull String s) {
    String curr = s;
    // first check if this constraint should be negated
    boolean negated;
    if (curr.startsWith("!")) {
      negated = true;
      curr = curr.substring(1);
    } else {
      negated = false;
    }
    String regex;
    boolean startRegex = curr.startsWith("/");
    boolean endRegex = curr.endsWith("/");
    if (startRegex && endRegex && curr.length() > 1) {
      // valid syntax for a regex
      regex = curr.substring(1, curr.length() - 1);
    } else if (!startRegex && !endRegex) {
      // the constraint denotes a single value; convert it to a regex
      regex = "^" + curr + "$";
    } else {
      throw new BatfishException("Invalid regex constraint: " + s);
    }
    return new RegexConstraint(regex, negated);
  }
