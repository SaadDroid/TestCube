public static boolean empty(String[] arr) {
        if (arr == null || arr.length == 0) {
            return true;
        }
        for (String s : arr) {
            if (s != null && !"".equals(s)) {
                return false;
            }
        }

        return true;
    }
