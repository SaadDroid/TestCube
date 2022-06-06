public static String GetDownloadSpeedString(double averageSpeed) {
        if (averageSpeed <= 0)
            return "0 B/s";

        double bps = averageSpeed * 1024D;
        if (bps < 1024)
            return String.format(LocaleUtil.getCurrent(), "%.1f B/s", bps);

        bps = bps / 1024;
        if (bps < 1024)
            return String.format(LocaleUtil.getCurrent(), "%.1f KB/s", bps);

        bps = bps / 1024;
        if (bps < 1024)
            return String.format(LocaleUtil.getCurrent(), "%.1f MB/s", bps);

        return String.format(LocaleUtil.getCurrent(), "%.1f GB/s", bps / 1024D);
    }
