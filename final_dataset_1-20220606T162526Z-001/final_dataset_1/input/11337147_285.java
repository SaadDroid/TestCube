public boolean isPageAuthorized(final String appToken, final String pageName) throws BonitaException {
        if (StringUtil.isBlank(appToken)) {
            return isPageAuthorizedInPortal(pageName);
        } else {
            return isPageAuthorizedInApplication(appToken, pageName);
        }
    }
