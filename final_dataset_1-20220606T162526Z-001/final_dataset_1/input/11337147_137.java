public void setTokenToResponseHeader(final HttpServletResponse res, final String token) {
        if(res.containsHeader(X_BONITA_API_TOKEN)){
            res.setHeader(X_BONITA_API_TOKEN, token);
        } else {
            res.addHeader(X_BONITA_API_TOKEN, token);
        }
    }
