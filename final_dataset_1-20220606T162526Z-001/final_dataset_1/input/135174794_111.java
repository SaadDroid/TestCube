@Nullable
  @Override
  ExternalIssue parse(String line) {
    Matcher matcher = GO_VET_LINE_REGEX.matcher(line);
    if (matcher.matches()) {
      String filename = matcher.group("file").trim();
      int lineNumber = Integer.parseInt(matcher.group("line").trim());
      String message = matcher.group("message").trim();
      return new ExternalIssue(LINTER_ID, RuleType.BUG, null, filename, lineNumber, message);
    } else if (!line.startsWith("exit status")) {
      LOG.debug(logPrefix() + "Unexpected line: " + line);
    }
    return null;
  }
