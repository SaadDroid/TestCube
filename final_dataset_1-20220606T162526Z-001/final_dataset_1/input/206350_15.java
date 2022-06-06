@Override
    public void doFilter(
            ServletRequest request,
            ServletResponse response,
            FilterChain chain) throws IOException, ServletException {

        CayenneRuntime runtime = WebUtil.getCayenneRuntime(servletContext);
        RequestHandler handler = runtime.getInjector().getInstance(RequestHandler.class);

        handler.requestStart(request, response);
        try {
            chain.doFilter(request, response);
        }
        finally {
            handler.requestEnd(request, response);
        }
    }
