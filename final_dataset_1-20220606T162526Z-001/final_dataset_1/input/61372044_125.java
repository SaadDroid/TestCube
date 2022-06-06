public static String toReadableSize(final long bytes) {
        if (bytes < KB && bytes >= 0) {
            return Long.toString(bytes) + " bytes";
        }
        final StringBuilder builder = new StringBuilder();
        final Formatter format = new Formatter(builder, Locale.getDefault());
        if (bytes < MB) {
            format.format("%.2f KB", (float) bytes / (float) KB);
        } else if (bytes < GB) {
            format.format("%.2f MB", (float) bytes / (float) MB);
        } else if (bytes < TB) {
            format.format("%.2f GB", (float) bytes / (float) GB);
        } else {
            format.format("%.4f TB", (float) bytes / (float) TB);
        }
        format.close();
        return builder.toString();
    }
