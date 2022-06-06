@Nonnull
  public static String escapeMarkdownStr(@Nonnull final String text) {
    final StringBuilder buffer = new StringBuilder(text.length() * 2);
    for (final char c : text.toCharArray()) {
      if (c == '\n') {
        buffer.append("<br/>"); //NOI18N
        continue;
      } else if (Character.isISOControl(c)) {
        continue;
      } else if (MD_ESCAPED_CHARS.indexOf(c) >= 0) {
        buffer.append('\\');
      }

      buffer.append(c);
    }
    return buffer.toString();
  }
