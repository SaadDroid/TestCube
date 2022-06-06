public static boolean isScope(String num, int index) {
        String[] strArray = StringUtils.split(num, ".");
        if (strArray.length != 4) {
            return false;
        }
        return isScope(strArray, index);

    }
