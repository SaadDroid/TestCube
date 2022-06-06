public String getBearerToken(HttpServletRequest request) {
        String authHeader = request.getHeader(HttpHeaders.AUTHORIZATION);
        return obtainCleanBearerToken(authHeader);
    }
