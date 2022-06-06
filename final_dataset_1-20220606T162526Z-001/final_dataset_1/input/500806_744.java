Cookie[] convertCookies(HttpEntity<?> httpEntity) {
        final List<Cookie> cookies = new LinkedList<>();

        List<String> inboundCookies = httpEntity.getHeaders().get(HttpHeaders.SET_COOKIE);
        if (inboundCookies != null) {
            for (String cookieString : inboundCookies) {
                Cookie cookie = convertCookieString(cookieString);
                cookies.add(cookie);
            }
        }

        return cookies.toArray(new Cookie[0]);
    }
