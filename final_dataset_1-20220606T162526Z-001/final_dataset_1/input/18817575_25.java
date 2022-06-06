public static String[] appendToAll(String append, String[] appendTo) {
        if (append == null) {
            throw new IllegalArgumentException("Method argument append must not be null.");
        }
        if (appendTo == null) {
            throw new IllegalArgumentException("Method argument to must not be null.");
        }

        String[] result = new String[appendTo.length];
        for (int i = 0; i  < appendTo.length; ++i) {
            result[i] = appendTo[i] == null ? null : appendTo[i] + append;
        }

        return result;
    }
