public String getLocalUrl(final HttpServletRequest request) {
        if (request.getQueryString() == null || request.getQueryString().isBlank()) {
            return request.getRequestURI();
        }

        return request.getRequestURI() + "?" + request.getQueryString();
    }
