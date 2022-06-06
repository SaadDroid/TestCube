@Override
    public int process(Callback[] callbacks, int state) throws LoginException {

        switch (state) {
        case ISAuthConstants.LOGIN_START: {
            setUserSessionProperty(JwtSessionModule.TOKEN_IDLE_TIME_IN_MINUTES_CLAIM_KEY, tokenIdleTime.toString());
            setUserSessionProperty(JwtSessionModule.MAX_TOKEN_LIFE_IN_MINUTES_KEY, maxTokenLife.toString());
            setUserSessionProperty(ENFORCE_CLIENT_IP_SETTING_KEY, Boolean.toString(enforceClientIP));
            setUserSessionProperty(SECURE_COOKIE_KEY, Boolean.toString(secureCookie));
            setUserSessionProperty(HTTP_ONLY_COOKIE_KEY, Boolean.toString(httpOnlyCookie));
            if (cookieName != null) {
                setUserSessionProperty(COOKIE_NAME_KEY, cookieName);
            }
            String cookieDomainsString = "";
            for (String cookieDomain : cookieDomains) {
                cookieDomainsString += cookieDomain + ",";
            }
            setUserSessionProperty(COOKIE_DOMAINS_KEY, cookieDomainsString);
            final Subject clientSubject = new Subject();
            MessageInfo messageInfo = prepareMessageInfo(getHttpServletRequest(), getHttpServletResponse());
            if (process(messageInfo, clientSubject, callbacks)) {
                return ISAuthConstants.LOGIN_SUCCEED;
            }
            throw new AuthLoginException(AUTH_RESOURCE_BUNDLE_NAME, "cookieNotValid", null);
        }
        default: {
            throw new AuthLoginException(AUTH_RESOURCE_BUNDLE_NAME, "incorrectState", null);
        }
        }
    }
