boolean shouldSkip(ServletRequest request) {
        return shouldSkip(new ServletServerHttpRequest((HttpServletRequest) request));
    }
