@Nullable
  @Override
  ExternalIssue parse(String line) {
    Matcher matcher = GO_LINT_LINE_REGEX.matcher(line);
    if (matcher.matches()) {
      String filename = matcher.group("file").trim();
      int lineNumber = Integer.parseInt(matcher.group("line").trim());
      String message = matcher.group("message").trim();
      return new ExternalIssue(LINTER_ID, RuleType.CODE_SMELL, null, filename, lineNumber, message);
    } else {
      LOG.debug(logPrefix() + "Unexpected line: " + line);
    }
    return null;
  }
