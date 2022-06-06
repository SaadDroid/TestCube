List<Cookie> enrich(List<Cookie> cookies, final TestContext context) {

        final List<Cookie> enrichedCookies = new LinkedList<>();

        for (final Cookie cookie : cookies) {
            final Cookie enrichedCookie = new Cookie(cookie.getName(), cookie.getValue());

            if (cookie.getValue() != null) {
                enrichedCookie.setValue(context.replaceDynamicContentInString(cookie.getValue()));
            }

            if (cookie.getComment() != null) {
                enrichedCookie.setComment(context.replaceDynamicContentInString(cookie.getComment()));
            }

            if (cookie.getPath() != null) {
                enrichedCookie.setPath(context.replaceDynamicContentInString(cookie.getPath()));
            }

            if (cookie.getDomain() != null) {
                enrichedCookie.setDomain(context.replaceDynamicContentInString(cookie.getDomain()));
            }

            enrichedCookie.setMaxAge(cookie.getMaxAge());
            enrichedCookie.setVersion(cookie.getVersion());
            enrichedCookie.setHttpOnly(cookie.isHttpOnly());
            enrichedCookie.setSecure(cookie.getSecure());

            enrichedCookies.add(enrichedCookie);
        }

        return enrichedCookies;
    }
