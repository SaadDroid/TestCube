public float checkDir(File dir) throws DiskErrorException,
            DiskOutOfSpaceException, DiskWarnThresholdException {
        float usage = checkDiskFull(dir);
        if (!mkdirsWithExistsCheck(dir)) {
            throw new DiskErrorException("can not create directory: "
                    + dir.toString());
        }

        if (!dir.isDirectory()) {
            throw new DiskErrorException("not a directory: " + dir.toString());
        }

        if (!dir.canRead()) {
            throw new DiskErrorException("directory is not readable: "
                    + dir.toString());
        }

        if (!dir.canWrite()) {
            throw new DiskErrorException("directory is not writable: "
                    + dir.toString());
        }
        return usage;
    }
