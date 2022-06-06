@Override
  public InputStream doReadBackup(String uniqueFileName) throws BackupException {
    try {
      return Files.newInputStream(Paths.get(getUploadFilePath(), uniqueFileName));
    } catch (IOException ex) {
      throw new BackupException("Error with reading backup file : " + ex.getMessage(), ex);
    }
  }
