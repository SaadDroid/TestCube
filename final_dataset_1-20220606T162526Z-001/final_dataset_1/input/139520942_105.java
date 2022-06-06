public static String join(List<String> src, String delimiter) {
        return src == null ? null : String.join(delimiter, src.toArray(new String[0]));
    }
