public static CharSequence formatScreenName(CharSequence screenName) {
        if (TextUtils.isEmpty(screenName)) {
            return "";
        }

        if (screenName.charAt(0) == '@') {
            return screenName;
        }
        return "@" + screenName;
    }
