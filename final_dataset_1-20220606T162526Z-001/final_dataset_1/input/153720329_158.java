public String build() {
        Assert.notNull(schema);
        Assert.isFalse(tempDir != null && backup, "tempDir is not allowed when backup is present, vice versa");

        StringBuilder path = new StringBuilder();
        if (absolute) {
            path.append(PATH_SVC.getSwiftPath()).append('/');
        }
        path.append(backup ? schema.getBackupDir() : schema.getDir());
        if (tempDir != null) {
            path.append('/').append(tempDir);
        }
        if (tableKey != null) {
            path.append('/').append(tableKey.getId());
        }
        if (segOrder != null) {
            path.append("/seg").append(segOrder);
        }
        if (columnId != null) {
            path.append('/').append(columnId);
        }
        return path.toString();
    }
