@Override
  public void execute(SensorContext context) {
    List<File> reportFiles = getReportFiles(context);

    if (reportFiles.isEmpty()) {
      return;
    }
    Set<String> unresolvedInputFile = new HashSet<>();

    for (File f : reportFiles) {
      LOG.info("Importing coverage from {}", f.getPath());
      try(InputStream in = new FileInputStream(f)){
        readReportFile(in, context, unresolvedInputFile);
      } catch (IOException | XMLStreamException | NumberFormatException e) {
        LOG.error("File '{}' can't be read. " + e.toString(), f, e);
      }
    }

    logUnresolvedInputFiles(unresolvedInputFile);
  }
