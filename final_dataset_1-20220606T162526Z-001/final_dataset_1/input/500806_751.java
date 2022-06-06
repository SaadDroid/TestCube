String getCookieString(Cookie cookie) {
        StringBuilder builder = new StringBuilder();

        builder.append(cookie.getName());
        builder.append("=");
        builder.append(cookie.getValue());

        if (cookie.getVersion() > 0) {
            builder.append(";" + VERSION + "=").append(cookie.getVersion());
        }

        if (StringUtils.hasText(cookie.getPath())) {
            builder.append(";" + PATH + "=").append(cookie.getPath());
        }

        if (StringUtils.hasText(cookie.getDomain())) {
            builder.append(";" + DOMAIN + "=").append(cookie.getDomain());
        }

        if (cookie.getMaxAge() > 0) {
            builder.append(";" + MAX_AGE + "=").append(cookie.getMaxAge());
        }

        if (StringUtils.hasText(cookie.getComment())) {
            builder.append(";" + COMMENT + "=").append(cookie.getComment());
        }

        if (cookie.getSecure()) {
            builder.append(";" + SECURE);
        }

        if (cookie.isHttpOnly()) {
            builder.append(";" + HTTP_ONLY);
        }

        return builder.toString();
    }
