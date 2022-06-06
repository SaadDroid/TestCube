@Nonnull
  public static String convertCamelCasedToHumanForm(@Nonnull final String camelCasedString, final boolean capitalizeFirstChar) {
    final StringBuilder result = new StringBuilder();

    boolean notFirst = false;

    for (final char c : camelCasedString.toCharArray()) {
      if (notFirst) {
        if (Character.isUpperCase(c)) {
          result.append(' ');
          result.append(Character.toLowerCase(c));
        } else {
          result.append(c);
        }
      } else {
        notFirst = true;
        if (capitalizeFirstChar) {
          result.append(Character.toUpperCase(c));
        } else {
          result.append(c);
        }
      }
    }
    return result.toString();
  }
