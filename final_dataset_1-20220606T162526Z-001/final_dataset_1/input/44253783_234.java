public List<ConfigurationCheckReport> runChecks(BootstrapProperties bootProperties) {
    List<ConfigurationCheckReport> reports = new ArrayList<>();
    configurationCheckers.forEach(checker -> {
      reports.add(checker.performConfigCheck(bootProperties));
    });

    return reports;
  }
