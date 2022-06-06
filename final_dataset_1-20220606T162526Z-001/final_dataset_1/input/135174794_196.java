protected Severity severity(String ruleKey, @Nullable String severity) {
    return "info".equals(severity) ? Severity.MINOR : Severity.MAJOR;
  }
