public String createOrLoadToken(final HttpSession session) {
        Object apiTokenFromClient = session.getAttribute(API_TOKEN);
        if (apiTokenFromClient == null) {
            apiTokenFromClient = new APIToken().getToken();
            session.setAttribute(API_TOKEN, apiTokenFromClient);
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.log(Level.FINE, "Bonita API Token generated: " + apiTokenFromClient);
            }
        }
        return apiTokenFromClient.toString();
    }
