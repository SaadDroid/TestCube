private void getSpecs(Path directory, Collection<Spec> specs) throws Exception {
    FileStatus[] fileStatuses = fs.listStatus(directory);
    for (FileStatus fileStatus : fileStatuses) {
      if (fileStatus.isDirectory()) {
        getSpecs(fileStatus.getPath(), specs);
      } else {
        try {
          specs.add(readSpecFromFile(fileStatus.getPath()));
        } catch (Exception e) {
          log.warn(String.format("Path[%s] cannot be correctly deserialized as Spec", fileStatus.getPath()), e);
        }
      }
    }
  }
