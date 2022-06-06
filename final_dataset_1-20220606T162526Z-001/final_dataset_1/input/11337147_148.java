@Override
    boolean checkValidCondition(HttpServletRequest httpRequest, HttpServletResponse httpResponse) {

        if (isCsrfProtectionEnabled() && !isSafeMethod(httpRequest.getMethod())) {
            String headerFromRequest = getCSRFToken(httpRequest);
            String apiToken = (String) httpRequest.getSession().getAttribute("api_token");

            if (headerFromRequest == null || !headerFromRequest.equals(apiToken)) {
                if (LOGGER.isLoggable(Level.FINE)) {
                    LOGGER.log(Level.FINE, "Token Validation failed, expected: " + apiToken + ", received: " + headerFromRequest);
                }
                httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
                return false;
            }
        }
        return true;
    }
