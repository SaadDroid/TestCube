public static String getRealm(String tokenString) {
        JWSInput jwtInput;
        AccessToken token = null;
        try {
            jwtInput = new JWSInput(tokenString);
            token = jwtInput.readJsonContent(AccessToken.class);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }

        String issuer = token.getIssuer();
        Matcher matcher = realmPattern.matcher(issuer);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }
