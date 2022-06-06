@Override
  public void addSerDeProperties(Path path, HiveRegistrationUnit hiveUnit) throws IOException {
    Preconditions.checkArgument(this.fs.getFileStatus(path).isDirectory(), path + " is not a directory.");
    Schema schema;
    try (Timer.Context context = metricContext.timer(HIVE_SPEC_SCHEMA_READING_TIMER).time()) {
      schema = getDirectorySchema(path);
    }
    if (schema == null) {
      return;
    }
    hiveUnit.setSerDeType(this.serDeWrapper.getSerDe().getClass().getName());
    hiveUnit.setInputFormat(this.serDeWrapper.getInputFormatClassName());
    hiveUnit.setOutputFormat(this.serDeWrapper.getOutputFormatClassName());
    addSchemaPropertiesIfRequired(path, hiveUnit, schema);
  }
