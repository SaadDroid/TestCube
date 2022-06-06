public static boolean requireNonce(String responseType) {
        return responseType!=null && (isHybridFlow(responseType) || ID_TOKEN.equals(responseType) || ID_TOKEN_TOKEN.equals(responseType));
    }
