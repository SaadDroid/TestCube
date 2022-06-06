@Override
    protected Map<String, Object> initialize(Subject subject, Map sharedState, Map options) {

        String idleTimeString = CollectionHelper.getMapAttr(options, COOKIE_IDLE_TIMEOUT_SETTING_KEY);
        String maxLifeString = CollectionHelper.getMapAttr(options, COOKIE_MAX_LIFE_SETTING_KEY);
        if (StringUtils.isEmpty(idleTimeString)) {
            DEBUG.warning("Cookie Idle Timeout not set. Defaulting to 0");
            idleTimeString = "0";
        }
        if (StringUtils.isEmpty(maxLifeString)) {
            DEBUG.warning("Cookie Max Life not set. Defaulting to 0");
            maxLifeString = "0";
        }
        tokenIdleTime = Integer.parseInt(idleTimeString) * MINUTES_IN_HOUR;
        maxTokenLife = Integer.parseInt(maxLifeString) * MINUTES_IN_HOUR;
        enforceClientIP = CollectionHelper.getBooleanMapAttr(options, ENFORCE_CLIENT_IP_SETTING_KEY, false);
        secureCookie = CollectionHelper.getBooleanMapAttr(options, SECURE_COOKIE_KEY, true);
        httpOnlyCookie = CollectionHelper.getBooleanMapAttr(options, HTTP_ONLY_COOKIE_KEY, true);
        cookieName = CollectionHelper.getMapAttr(options, COOKIE_NAME_KEY);
        cookieDomains = coreWrapper.getCookieDomainsForRequest(getHttpServletRequest());

        try {
            return initialize(tokenIdleTime.toString(), maxTokenLife.toString(), enforceClientIP, getRequestOrg(),
                    secureCookie, httpOnlyCookie, cookieName, cookieDomains);
        } catch (SMSException e) {
            DEBUG.error("Error initialising Authentication Module", e);
            return null;
        } catch (SSOException e) {
            DEBUG.error("Error initialising Authentication Module", e);
            return null;
        }
    }
