public void route(final HttpServletRequest hsRequest, final HttpServletResponse hsResponse, final APISession session, final PageRenderer pageRenderer,
            final ResourceRenderer resourceRenderer, final BonitaHomeFolderAccessor bonitaHomeFolderAccessor)
            throws CreationException, BonitaException, IOException, ServletException, IllegalAccessException, InstantiationException {

        final ParsedRequest parsedRequest = parse(hsRequest.getContextPath(), hsRequest.getServletPath(), hsRequest.getPathInfo());
        //Test if url contain at least application name
        final List<String> pathSegments = resourceRenderer.getPathSegments(hsRequest.getPathInfo());
        if (pathSegments.isEmpty()) {
            hsResponse.sendError(HttpServletResponse.SC_BAD_REQUEST,
                    "The name of the application is required.");
            return;
        }
        if ("API".equals(parsedRequest.getPageToken())) {
            //Support relative calls to the REST API from the application page using ../API/
            String apiPath = "/" + getResourcePathWithoutApplicationToken(hsRequest.getPathInfo(), parsedRequest.getApplicationName());
            //security check against directory traversal attack
            customPageRequestModifier.forwardIfRequestIsAuthorized(hsRequest, hsResponse, "/API", apiPath);
        } else if ("GET".equals(hsRequest.getMethod())) {
            displayPageOrResource(hsRequest, hsResponse, session, pageRenderer, resourceRenderer, bonitaHomeFolderAccessor, parsedRequest, pathSegments);
        } else {
            hsResponse.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "http.method_" + hsRequest.getMethod().toLowerCase() + "_not_supported");
        }
    }
