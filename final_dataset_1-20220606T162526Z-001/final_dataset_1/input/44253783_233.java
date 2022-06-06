@SuppressWarnings("resource")
  @Override
  public ConfigurationCheckReport performConfigCheck(ConfigurationCheckReport report, BootstrapProperties bootProperties) {
    boolean passed = true;
    try (ScanResult result = new ClassGraph().scan()) {
      for (Map.Entry<String, ResourceList> dup : result.getAllResources().classFilesOnly().findDuplicatePaths()) {
        if (dup.getKey().equalsIgnoreCase("module-info.class")) {
          continue;
        }
        passed = false;
        if (debugMode()) {
          System.err.println(String.format("%s has possible duplicates", dup.getKey()));
          for (Resource res : dup.getValue()) {
            System.err.println(String.format(" -> Found in %s", res.getURI()));
          }
        }
      }
    }
    if(!passed) {
      if (debugMode()) {
        report.getWarnings().add("Possible duplicates found.  Details above.");
      } else {
        report.getWarnings().add("Possible duplicates found.  Re-run with '-Dinterlok.bootstrap.debug=true' for more details.");
      }
    }

    return report;
  }
