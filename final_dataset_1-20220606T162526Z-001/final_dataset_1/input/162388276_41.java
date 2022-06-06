public static int maxStrLength(Collection<String> strList) {
        int ret = 0;
        for (String s : strList) {
            if (s.length() > ret) {
                ret = s.length();
            }
        }
        return ret;
    }
