public static ParseResult parse(String text) {
    Map<String, String> localProperties = new HashMap<>();
    String intpText = "";
    String scriptText = null;

    Matcher matcher = REPL_PATTERN.matcher(text);
    if (matcher.find()) {
      String headingSpace = matcher.group(1);
      intpText = matcher.group(2);
      int startPos = headingSpace.length() + intpText.length() + 1;
      if (startPos < text.length() && text.charAt(startPos) == '(') {
        startPos = parseLocalProperties(text, startPos, localProperties);
      }
      scriptText = text.substring(startPos).trim();
    } else {
      intpText = "";
      scriptText = text.trim();
    }

    return new ParseResult(intpText, scriptText, localProperties);
  }
