@SuppressWarnings("unchecked")
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (permanent) {
            response.setStatus(HttpServletResponse.SC_MOVED_PERMANENTLY);
            response = new HttpServletResponseWrapper(response) {

                @Override
                public void setStatus(int sc) {
                }

                @Override
                public void sendRedirect(String location) throws IOException {
                    setHeader("Location", location);
                }

            };
        }
        if (this.includeRequestParameters) {
            addParameters(request.getParameterMap());
        }

        // Add any beans to the flash scope
        if (this.beans != null) {
            FlashScope flash = FlashScope.getCurrent(request, true);
            for (ActionBean bean : this.beans) {
                flash.put(bean);
            }
        }

        // If a flash scope exists, add the parameter to the request
        FlashScope flash = FlashScope.getCurrent(request, false);
        if (flash != null) {
            addParameter(StripesConstants.URL_KEY_FLASH_SCOPE_ID, flash.key());
        }

        // Prepend the context path if requested
        String url = getUrl(request.getLocale());
        if (prependContext) {
            String contextPath = request.getContextPath();
            if (contextPath.length() > 1) {
                url = contextPath + url;
            }
        }

        url = response.encodeRedirectURL(url);
        log.trace("Redirecting ", this.beans == null ? "" : "(w/flashed bean) ", "to URL: ", url);

        response.sendRedirect(url);

        AsyncResponse asyncResponse = AsyncResponse.get(request);
        if (asyncResponse != null) {
            // async started, complete
            asyncResponse.complete();
        }
    }
