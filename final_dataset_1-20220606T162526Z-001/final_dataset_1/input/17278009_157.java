public static String findResponseTimeLogFileInDirectory(String contextPath, File responseTimeLogFileDirectory) {
        if (contextPath == null) {
            throw new IllegalArgumentException("contextPath is null");
        }
        if (!contextPath.startsWith("/")) {
            throw new IllegalArgumentException("contextPath does not start with '/': " + contextPath);
        }
        if (responseTimeLogFileDirectory == null) {
            throw new IllegalArgumentException("responseTimeLogFileDirectory is null");
        }
        if (responseTimeLogFileDirectory.exists() && responseTimeLogFileDirectory.isDirectory()) {
            // Handle the root context path
            // Remove leading slash and convert slashes to underscores
            final String rtFileSuffix = (contextPath.equals("/") ? "ROOT" : contextPath).substring(1).replace('/', '_')
                + "_rt.log";
            File[] files = responseTimeLogFileDirectory.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(rtFileSuffix);
                }
            });
            if (files != null && files.length == 1) {
                return files[0].getAbsolutePath();
            }
        }
        return null;
    }
