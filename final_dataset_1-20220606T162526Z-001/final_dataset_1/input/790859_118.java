public void scan(URL url) throws IOException {
        File file = toClassPathFile(url);

        if (file.exists()) {
            if (file.isDirectory()) {
                handleDirectory(file, url.getRef());
            } else {
                handleArchive(file);
            }
        } else {
            CommonCoreLogger.ROOT_LOGGER.unknownClasspathURL(file.getAbsolutePath());
        }
    }
