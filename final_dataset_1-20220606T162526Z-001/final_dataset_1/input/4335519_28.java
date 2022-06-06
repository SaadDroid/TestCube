public void execute(SensorContext context) {
    checkDeprecatedEslintProperty(context);

    List<TreeVisitor> treeVisitors = new ArrayList<>();
    treeVisitors.add(new SeChecksDispatcher(checks.seChecks()));
    treeVisitors.addAll(checks.visitorChecks());

    Iterable<InputFile> inputFiles = getInputFiles(context);
    Collection<String> files = StreamSupport.stream(inputFiles.spliterator(), false)
      .map(InputFile::toString)
      .collect(Collectors.toList());

    ProgressReport progressReport = new ProgressReport("Report about progress of Javascript analyzer", TimeUnit.SECONDS.toMillis(10));
    progressReport.start(files);

    analyseFiles(context, treeVisitors, inputFiles, progressReport);
  }
