public static boolean isDouble(String value) {
        if (!isEmpty(value) && patternDouble.matcher(value).matches()) {
            return true;
        }
        return false;
    }
