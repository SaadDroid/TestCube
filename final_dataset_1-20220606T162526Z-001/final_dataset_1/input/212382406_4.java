public File getLastKnownDB(File reconDbDir, String fileNamePrefix) {
    String lastKnownSnapshotFileName = null;
    long lastKnonwnSnapshotTs = Long.MIN_VALUE;
    if (reconDbDir != null) {
      File[] snapshotFiles = reconDbDir.listFiles((dir, name) ->
          name.startsWith(fileNamePrefix));
      if (snapshotFiles != null) {
        for (File snapshotFile : snapshotFiles) {
          String fileName = snapshotFile.getName();
          try {
            String[] fileNameSplits = fileName.split("_");
            if (fileNameSplits.length <= 1) {
              continue;
            }
            long snapshotTimestamp = Long.parseLong(fileNameSplits[1]);
            if (lastKnonwnSnapshotTs < snapshotTimestamp) {
              lastKnonwnSnapshotTs = snapshotTimestamp;
              lastKnownSnapshotFileName = fileName;
            }
          } catch (NumberFormatException nfEx) {
            LOG.warn("Unknown file found in Recon DB dir : {}", fileName);
          }
        }
      }
    }
    return lastKnownSnapshotFileName == null ? null :
        new File(reconDbDir.getPath(), lastKnownSnapshotFileName);
  }
