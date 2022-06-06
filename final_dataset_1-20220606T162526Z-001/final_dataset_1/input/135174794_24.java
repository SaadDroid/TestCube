@Override
  public void execute(SensorContext sensorContext) {
    DurationStatistics statistics = new DurationStatistics(sensorContext.config());
    FileSystem fileSystem = sensorContext.fileSystem();
    FilePredicate mainFilePredicate = fileSystem.predicates().and(
      fileSystem.predicates().hasLanguage(language.getKey()),
      fileSystem.predicates().hasType(InputFile.Type.MAIN));
    Iterable<InputFile> inputFiles = fileSystem.inputFiles(mainFilePredicate);
    List<String> filenames = StreamSupport.stream(inputFiles.spliterator(), false).map(InputFile::toString).collect(Collectors.toList());
    ProgressReport progressReport = new ProgressReport("Progress of the " + language.getName() + " analysis", TimeUnit.SECONDS.toMillis(10));
    progressReport.start(filenames);
    boolean success = false;
    ASTConverter converter = ASTConverterValidation.wrap(astConverter(sensorContext), sensorContext.config());
    try {
      success = analyseFiles(converter, sensorContext, inputFiles, progressReport, visitors(sensorContext, statistics), statistics);
    } finally {
      if (success) {
        progressReport.stop();
      } else {
        progressReport.cancel();
      }
      converter.terminate();
    }
    statistics.log();
  }
