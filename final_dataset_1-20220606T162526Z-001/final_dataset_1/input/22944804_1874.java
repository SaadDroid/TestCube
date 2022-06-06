@Override
    public void beforeAuthorizeHandling(OAuth2Request o2request, Request request, Response response) {
        String loginHint = o2request.getParameter(LOGIN_HINT);
        if (loginHint != null && !loginHint.equals(request.getCookies().getFirstValue(LOGIN_HINT_COOKIE))) {
            CookieSetting cookie = new CookieSetting(0, LOGIN_HINT_COOKIE, loginHint);
            cookie.setPath("/");
            // set HttpOnly flag
            cookie.setAccessRestricted(true);
            response.getCookieSettings().add(cookie);
        }

    }
