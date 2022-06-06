public static URI toAbsoluteUri(String relativePath, Message message) {
        String base = BaseUrlHelper.getBaseURL(
            (HttpServletRequest)message.get(AbstractHTTPDestination.HTTP_REQUEST));
        return URI.create(base + relativePath);
    }
