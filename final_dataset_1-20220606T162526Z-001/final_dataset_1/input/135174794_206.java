@Override
  public void execute(SensorContext context) {
    try {
      Map<Path, String> reports = getReportFilesAndContents(context);
      if (reports.isEmpty()) {
        return;
      }

      JSONParser parser = new JSONParser();
      Map<String, Map<Integer, Integer>> mergedCoverages = new HashMap<>();
      for (Entry<Path, String> report : reports.entrySet()) {
        try {
          JSONObject parseResult = (JSONObject) parser.parse(report.getValue());
          mergeFileCoverages(mergedCoverages, parseResult.entrySet());
        } catch (Exception e) {
          LOG.error("Cannot read coverage report file, expecting standard SimpleCov resultset JSON format: '{}'", report.getKey(), e);
        }
      }

      saveCoverage(context, mergedCoverages);
    } catch (IOException e) {
      LOG.error("Error reading coverage reports", e);
    }
  }
