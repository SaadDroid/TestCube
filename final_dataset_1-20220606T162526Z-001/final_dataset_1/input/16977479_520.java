public static String getThumbprint(String keySequence) {
        return getThumbprint(readJwkKey(keySequence));
    }
