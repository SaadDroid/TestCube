@Override
    public Map<String, Cookie> getCookies() {
        if (cookies == null) {
            cookies = new HashMap<>();
            final javax.servlet.http.Cookie[] servletCookies = request.getCookies();
            for (int i = 0; i < servletCookies.length; i++) {
                final String name = servletCookies[i].getName();
                final String value = servletCookies[i].getValue();
                cookies.put(name, new Cookie(name, value));
            }
        }
        return cookies;
    }
