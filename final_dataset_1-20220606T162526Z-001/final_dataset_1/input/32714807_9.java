public static String adjustStoragePathIfNecessary(String originalPath, IStorageDestinationAdjuster adjuster) {
        String path = originalPath;
        if (null != adjuster) {
            String newPath = adjuster.adjustPath(path);
            if (null != newPath) {
                path = newPath;
            }
        }
        if (null == path) {
            path = "";
        }
        return path;
    }
