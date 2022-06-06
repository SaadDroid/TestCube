@Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {
        if (isFilteredURI(servletRequest)) {
            LOG.debug("Is a filtered URI: {}. Passing request downstream.",
                    ((HttpServletRequest)servletRequest).getRequestURI());
            filterChain.doFilter(servletRequest, servletResponse);
        } else if (isInstanceActive()) {
            LOG.debug("Active. Passing request downstream");
            filterChain.doFilter(servletRequest, servletResponse);
        } else if (serviceState.isInstanceInTransition()) {
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            LOG.error("Instance in transition. Service may not be ready to return a result");
            httpServletResponse.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
        } else {
            HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
            String activeServerAddress = activeInstanceState.getActiveServerAddress();
            if (activeServerAddress == null) {
                LOG.error("Could not retrieve active server address as it is null. Cannot redirect request {}",
                        ((HttpServletRequest)servletRequest).getRequestURI());
                httpServletResponse.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
            } else {
                handleRedirect((HttpServletRequest) servletRequest, httpServletResponse, activeServerAddress);
            }
        }
    }
