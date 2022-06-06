@Override
  public void put(String jobName, String datasetUrn, CommitSequence commitSequence) throws IOException {
    datasetUrn = sanitizeDatasetUrn(datasetUrn);
    if (exists(jobName, datasetUrn)) {
      throw new IOException(String.format("CommitSequence already exists for job %s, dataset %s", jobName, datasetUrn));
    }

    Path jobPath = new Path(this.rootPath, jobName);
    this.fs.mkdirs(jobPath);

    Path datasetPath = new Path(jobPath, datasetUrn);
    try (DataOutputStream dos = this.fs.create(datasetPath)) {
      dos.writeBytes(GSON.toJson(commitSequence));
    }
  }
