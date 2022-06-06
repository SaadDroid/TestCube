protected void redirectTo(final HttpServletRequestAccessor request, final HttpServletResponse response, final long tenantId, final String pagePath)
            throws ServletException {
        try {
            response.sendRedirect(request.asHttpServletRequest().getContextPath() + pagePath);
        } catch (final IOException e) {
            if (LOGGER.isLoggable(Level.INFO)) {
                LOGGER.log(Level.INFO, e.getMessage());
            }
        }
    }
