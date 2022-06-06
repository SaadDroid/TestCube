public void doFilter(
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain chain)
            throws IOException, ServletException {

        if (!(servletResponse instanceof HttpServletResponse) || !(servletRequest instanceof HttpServletRequest)) {
            chain.doFilter(servletRequest, servletResponse);
            return;
        }

        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpServletRequest request = (HttpServletRequest) servletRequest;

        if (xuiState.isXUIEnabled() && request.getRequestURI() != null) {
            String query = request.getQueryString();

            // prepare query
            if (query != null) {
                if (!query.startsWith("&")) {
                    query = "&" + query;
                }
            } else {
                query = "";
            }

            // redirect to correct location
            if (request.getRequestURI().contains("UI/Logout")) {
                response.sendRedirect(xuiLogoutPath + query);
            } else if (request.getRequestURI().contains("idm/EndUser")) {
                response.sendRedirect(profilePage + query);
            } else {
                String compositeAdvice = (String)request.getParameter(Constants.COMPOSITE_ADVICE);
                
                if (compositeAdvice != null) {
                    try {
                        compositeAdvice = ESAPI.encoder().encodeForURL(compositeAdvice);
                        
                        final String authIndexType  = "authIndexType=composite_advice";
                        final String authIndexValue = "authIndexValue=" + compositeAdvice;
                        query = removeCompositeAdviceFromRequest(request) + "&" + authIndexType + "&" + authIndexValue;
                    } catch (EncodingException e) {
                        DEBUG.error("XUIFilter.doFilter::  failed to encode composite_advice : " + compositeAdvice, e);
                    }
                }
                response.sendRedirect(xuiLoginPath + query);
            }
        } else {
            chain.doFilter(servletRequest, servletResponse);
        }
    }
