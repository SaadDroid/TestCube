public static String formatE164(Object data, String regionCode) {
        PhoneNumber phoneNumber = parseToPhoneNumber(data, regionCode);
        if (phoneNumber == null) {
            return StringUtils.EMPTY;
        }
        return GOOGLE_PHONE_UTIL.format(phoneNumber, PhoneNumberFormat.E164);
    }
