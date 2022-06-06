Collection<File> resolveLogFiles() throws IOException {
        File logDir = getLogfileDirectory();
        Collection<File> logFiles = new TreeSet<>((o1, o2) -> o1.getPath().compareToIgnoreCase(o2.getPath()));

        if (logDir == null) {
            // No configured log file directory exists, assume the default
            logDir = new File(this.slingHomeDirectory, "logs");
        }

        // The log directory may be removed during runtime - always check access.
        if (logDir.exists() && logDir.isDirectory()) {
            logFiles.addAll(listFiles(logDir, LOGFILE_FILTER, TrueFileFilter.INSTANCE));
        }

        for (File logFile : resolveFactoryConfiguredLogFiles()) {
            if (!logFile.getParentFile().getAbsolutePath().startsWith(logDir.getAbsolutePath())) {
                logFiles.addAll(listFiles(logFile.getParentFile(), LOGFILE_FILTER, TrueFileFilter.INSTANCE));
            }
        }
        return logFiles;
    }
