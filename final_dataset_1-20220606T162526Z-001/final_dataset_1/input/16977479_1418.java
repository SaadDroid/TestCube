public static String queryEncode(String value) {

        return componentEncode(QUERY_RESERVED_CHARACTERS, value);
    }
