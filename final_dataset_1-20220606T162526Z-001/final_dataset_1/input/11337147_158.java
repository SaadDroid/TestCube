@Override
    protected boolean checkValidCondition(final HttpServletRequest httpRequest, final HttpServletResponse httpResponse) throws ServletException {
        try {
            if (httpRequest.getRequestURI().matches(PLATFORM_API_URI_REGEXP)) {
                return platformAPIsCheck(httpRequest, httpResponse);
            } else {
                return tenantAPIsCheck(httpRequest, httpResponse);
            }
        } catch (final Exception e) {
            if (LOGGER.isLoggable(Level.SEVERE)) {
                LOGGER.log(Level.SEVERE, e.getMessage(), e);
            }
            throw new ServletException(e);
        }
    }
