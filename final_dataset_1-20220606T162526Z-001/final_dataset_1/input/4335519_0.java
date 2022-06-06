@Override
  public boolean accept(InputFile inputFile) {

    boolean isJsTs =
      JavaScriptLanguage.KEY.equals(inputFile.language()) ||
      TypeScriptLanguage.KEY.equals(inputFile.language());

    if (isJsTs && SizeAssessor.hasExcessiveSize(inputFile, maxFileSizeKb * 1000)) {
      LOG.debug("File {} was excluded because of excessive size", inputFile);
      return false;
    }

    String relativePath = inputFile.uri().toString();
    if (WildcardPattern.match(excludedPatterns, relativePath)) {
      LOG.debug("File {} was excluded by {} or {}", inputFile, JavaScriptPlugin.JS_EXCLUSIONS_KEY, JavaScriptPlugin.TS_EXCLUSIONS_KEY);
      return false;
    }

    boolean isMinified = new MinificationAssessor().isMinified(inputFile);
    if (isMinified) {
      LOG.debug("File [" + inputFile.uri() + "] looks like a minified file and will not be analyzed");
      return false;
    }

    return true;
  }
