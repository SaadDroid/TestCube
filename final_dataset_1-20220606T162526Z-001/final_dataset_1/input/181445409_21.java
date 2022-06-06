@Override
    public MultiValueMap<String, ResponseCookie> getCookies() {
        MultiValueMap<String, ResponseCookie> cookies = new LinkedMultiValueMap<>();

        delegate.cookies()
            .stream()
            .map(CookieConverter::toResponseCookies)
            .flatMap(Collection::stream)
            .forEach(cookie -> cookies.add(cookie.getName(), cookie));

        return cookies;
    }
