@Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException {
        String iconIdPath = request.getPathInfo();
        if (iconIdPath == null || iconIdPath.isEmpty()) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        Long iconId = parseLong(iconIdPath);
        if (iconId == null) {
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            return;
        }
        IdentityAPI identityAPI = getIdentityApi(request);
        Icon icon;
        try {
            icon = identityAPI.getIcon(iconId);
        } catch (NotFoundException e) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        response.setContentType(icon.getMimeType());
        response.setCharacterEncoding("UTF-8");
        try {
            setHeaders(request, response, iconId);
        } catch (UnsupportedEncodingException e) {
            logAndThrowException(e, "Error while generating the headers.");
        }
        try (OutputStream out = response.getOutputStream()) {
            response.setContentLength(icon.getContent().length);
            out.write(icon.getContent());
        } catch (final IOException e) {
            logAndThrowException(e, "Error while generating the response.");
        }

    }
