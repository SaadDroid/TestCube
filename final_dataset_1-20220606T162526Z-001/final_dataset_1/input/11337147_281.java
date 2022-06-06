public void forwardIfRequestIsAuthorized(final HttpServletRequest request, final HttpServletResponse response, final String apiPathShouldStartWith, final String apiPath) throws IOException, ServletException {
        try {
            URI uri = new URI(apiPath);
            if (!uri.normalize().toString().startsWith(apiPathShouldStartWith)) {
                final String message = "attempt to access unauthorized path " + apiPath;
                if (LOGGER.isLoggable(Level.FINE)) {
                    LOGGER.log(Level.FINE, message);
                }
                response.sendError(HttpServletResponse.SC_FORBIDDEN, message);
            } else {
                request.getRequestDispatcher(apiPath).forward(request, response);
            }
        }catch (URISyntaxException e) {
            if (LOGGER.isLoggable(Level.FINE)) {
                LOGGER.log(Level.FINE, e.getMessage());
            }
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, e.getMessage());
        }
    }
