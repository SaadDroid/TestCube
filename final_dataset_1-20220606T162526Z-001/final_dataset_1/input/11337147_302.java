@Override
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        /*
         * Check if requested URL is missing last slash, like "custom-page/page-name".
         * If missing, redirect to "custom-page/page-name/"
         */
        if (isPageUrlWithoutFinalSlash(request)) {
            customPageRequestModifier.redirectToValidPageUrl(request, response);
            return;
        }

        final String appToken = request.getParameter(APP_TOKEN_PARAM);
        final HttpSession session = request.getSession();
        final APISession apiSession = (APISession) session.getAttribute(SessionUtil.API_SESSION_PARAM_KEY);

        final List<String> pathSegments = resourceRenderer.getPathSegments(request.getPathInfo());
        if (pathSegments.isEmpty()) {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST,
                    "The name of the page is required.");
            return;
        }
        final String pageName = pathSegments.get(0);

        try {

            if (isAuthorized(apiSession, appToken, pageName)) {
                if (isPageRequest(pathSegments)) {
                    pageRenderer.displayCustomPage(request, response, apiSession, pageName);
                } else {
                    final File resourceFile = getResourceFile(request.getPathInfo(), pageName, apiSession);
                    pageRenderer.ensurePageFolderIsPresent(apiSession, pageRenderer.getPageResourceProvider(pageName, apiSession.getTenantId()));
                    resourceRenderer.renderFile(request, response, resourceFile, apiSession);
                }
            } else {
                response.sendError(HttpServletResponse.SC_FORBIDDEN, "User not Authorized");
                return;
            }
        } catch (final Exception e) {
            handleException(pageName, e);
        }

    }
