public static List<String> findMainClasses(File rootDir) throws IOException {
        List<String> ret = new ArrayList<>();
        if (!rootDir.exists()) {
            return ret;
        }
        if (!rootDir.isDirectory()) {
            throw new IllegalArgumentException(String.format("Path %s is not a directory",rootDir.getPath()));
        }
        findClasses(ret, rootDir, rootDir.getAbsolutePath() + "/");
        return ret;
    }
