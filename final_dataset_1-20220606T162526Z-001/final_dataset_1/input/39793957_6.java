public static String getZipFileName(IZipConfig config, Date modificationDateTime) {
        StringBuilder zipFileName = new StringBuilder()
                .append(config.getZipName())
                .append(getDateString(config.getDateModifiedFrom()))
                .append(getDateString(modificationDateTime))
                .append(".zip");
        return zipFileName.toString();

    }
