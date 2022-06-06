@Override
    protected void service(final HttpServletRequest request, final HttpServletResponse response) throws ServletException, IOException {
        final String pathInfo = request.getPathInfo();

        if (!pathInfo.contains(RESOURCE_PATH_SEPARATOR + "/") && pathInfo.indexOf(API_PATH_SEPARATOR + "/") > 0) {
            //Support relative calls to the REST API from the forms using ../API/
            final String apiPath = pathInfo.substring(pathInfo.indexOf(API_PATH_SEPARATOR + "/"));
            //security check against directory traversal attack
            customPageRequestModifier.forwardIfRequestIsAuthorized(request, response, API_PATH_SEPARATOR, apiPath);
        } else{
            super.service(request, response);
        }
    }
