public String toString(Cookie c) {
        StringBuilder sb = new StringBuilder();

        if (c.getVersion() != 0) {
            sb.append(VERSION).append('=').append(c.getVersion()).append(';');
        }
        sb.append(c.getName()).append('=').append(NewCookieHeaderProvider.maybeQuoteAll(c.getValue()));
        if (c.getPath() != null) {
            sb.append(';').append(PATH).append('=').append(NewCookieHeaderProvider.maybeQuotePath(c.getPath()));
        }
        if (c.getDomain() != null) {
            sb.append(';').append(DOMAIN).append('=').append(NewCookieHeaderProvider.maybeQuoteAll(c.getDomain()));
        }
        return sb.toString();
    }
