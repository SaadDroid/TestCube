public static String getOautHeaderString(Credentials credentials, String method, String baseUrl, Map<String, String> params) {
        String nonce = UUID.randomUUID().toString();
        int time = Math.round(System.currentTimeMillis()/1000L);
        return getOautHeaderString(credentials, method, baseUrl, params, nonce, time);
    }
