public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {

            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }
