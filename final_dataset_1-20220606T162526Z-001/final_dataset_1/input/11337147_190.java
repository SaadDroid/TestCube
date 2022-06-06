public String protectRedirectUrl(String redirectUrl) {
        if (redirectUrl != null && !redirectUrl.startsWith("portal")) {
            return removeTokenFromUrl(redirectUrl, new ArrayList<String>(tokens));
        }
        return redirectUrl;
    }
