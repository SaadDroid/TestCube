public static String getSoftVersion() {
        String softVersion;
        try {
            softVersion = FileUtils.readFile2Str(new FileInputStream(new File("sql/soft_version")));
            softVersion = replaceBlank(softVersion);
        } catch (FileNotFoundException e) {
            logger.error(e.getMessage(), e);
            throw new RuntimeException("Failed to get the product version description file. The file could not be found", e);
        }
        return softVersion;
    }
