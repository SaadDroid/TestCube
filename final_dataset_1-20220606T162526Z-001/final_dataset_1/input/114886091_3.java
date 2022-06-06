public static boolean isValidNumber(String number) {
        if (number == null) {
            return false;
        }
        number = number.trim().replaceAll("\\s+", "");
        if (!PHONE_PATTERN.matcher(number).matches()) {
            return false;
        }
        return true;
    }
