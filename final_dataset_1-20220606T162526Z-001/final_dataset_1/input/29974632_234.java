public static String buildBaseUrl(final HttpServletRequest request) {
        // The request might have been forwarded internally
        final String requestUri = Optional.ofNullable((String) request.getAttribute(RequestDispatcher.FORWARD_REQUEST_URI))
                .orElseGet(request::getRequestURI);

        final String path = requestUri.replaceFirst(request.getContextPath(), "");

        // Subtract 1 for the / after the context path
        final int depth = StringUtils.countMatches(path, "/") - 1;
        return depth <= 0 ? "." : StringUtils.repeat("../", depth);
    }
