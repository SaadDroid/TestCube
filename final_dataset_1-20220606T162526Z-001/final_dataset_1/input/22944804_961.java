@Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException,
            ServletException {
        HttpServletRequest  request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        try {
            if (setupManager.isCurrentConfigurationValid()) {
                if (isSetupRequest(request.getRequestURI())) {
                    response.sendRedirect(createCleanUrl(request));
                } else {
                    filterChain.doFilter(request, response);
                }
            } else {
                if (isConfigStoreDown()) {
                    String redirectUrl = System.getProperty(Constants.CONFIG_STORE_DOWN_REDIRECT_URL);
                    if (StringUtils.isNotEmpty(redirectUrl)) {
                        response.sendRedirect(redirectUrl);
                    } else {
                        throw new ConfigurationException(CONFIG_STORE_DOWN_ERROR_CODE, null);
                    }
                } else {
                    if (isPassthrough && isRequestForAllowedResource(resourcePath(request))) {
                        filterChain.doFilter(request, response);
                    } else if (isConfiguratorRequest(request.getRequestURI())) {
                        filterChain.doFilter(request, response);
                    } else {
                        String url = createCleanUrl(request);
                        if (hasWritePermissionOnUserHomeDirectory()) {
                            url += SETUP_URI;
                        } else {
                            url += NOWRITE_PERMISSION;
                        }
                        response.sendRedirect(url);
                        enablePassthrough();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException("AMSetupFilter.doFilter", e);
        }
    }
