@Nullable
  @Override
  ExternalIssue parse(String line) {
    Matcher matcher = GO_META_LINTER_REGEX.matcher(line);
    if (matcher.matches()) {
      String linter = mapLinterName(matcher.group("linter").trim());
      RuleType type = "error".equals(matcher.group("severity")) ? RuleType.BUG : RuleType.CODE_SMELL;
      String filename = matcher.group("file").trim();
      int lineNumber = Integer.parseInt(matcher.group("line").trim());
      String message = matcher.group("message").trim();
      Matcher ruleKeyMatcher = RULE_KEY_REGEX.matcher(message);
      String ruleKey = null;
      if (ruleKeyMatcher.find()) {
        ruleKey = ruleKeyMatcher.group("ruleKey");
        message = message.substring(0, ruleKeyMatcher.start()).trim();
      }
      return new ExternalIssue(linter, type, ruleKey, filename, lineNumber, message);
    } else {
      LOG.debug(logPrefix() + "Unexpected line: " + line);
    }
    return null;
  }
