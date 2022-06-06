public static String GetLengthString(final long lengthInBytes) {

        if (lengthInBytes < 1024)
            return String
                    .format(LocaleUtil.getCurrent(), "%d B", lengthInBytes);

        double v = lengthInBytes / 1024D;
        if (v < 1024)
            return String.format(LocaleUtil.getCurrent(), "%.1f KB", v);

        v = v / 1024D;
        if (v < 1024)
            return String.format(LocaleUtil.getCurrent(), "%.1f MB", v);

        return String.format(LocaleUtil.getCurrent(), "%.1f GB", v / 1024D);
    }
