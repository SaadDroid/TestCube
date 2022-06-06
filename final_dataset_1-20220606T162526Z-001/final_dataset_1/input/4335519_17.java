@Override
  public void execute(SensorContext context) {
    Set<String> reports = new HashSet<>(Arrays.asList(context.config().getStringArray(JavaScriptPlugin.LCOV_REPORT_PATHS)));

    if (context.config().hasKey(JavaScriptPlugin.TS_LCOV_REPORT_PATHS)) {
      LOG.warn("The use of " + JavaScriptPlugin.TS_LCOV_REPORT_PATHS + " for coverage import is deprecated, use "
        + JavaScriptPlugin.LCOV_REPORT_PATHS + " instead.");
      reports.addAll(Arrays.asList(context.config().getStringArray(JavaScriptPlugin.TS_LCOV_REPORT_PATHS)));
    }

    List<File> lcovFiles = reports.stream()
      .map(report -> getIOFile(context.fileSystem().baseDir(), report))
      .filter(Objects::nonNull)
      .collect(Collectors.toList());

    if (lcovFiles.isEmpty()) {
      LOG.warn("No coverage information will be saved because all LCOV files cannot be found.");
      return;
    }
    saveCoverageFromLcovFiles(context, lcovFiles);
  }
