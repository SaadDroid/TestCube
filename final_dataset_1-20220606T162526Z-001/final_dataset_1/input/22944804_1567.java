public Promise<ActionResponse, ResourceException> actionCollection(Context context, ActionRequest request) {
        final String cookieName = SystemProperties.get(Constants.AM_COOKIE_NAME, "iPlanetDirectoryPro");

        String tokenId = getTokenIdFromUrlParam(request);

        if (tokenId == null) {
            tokenId = getTokenIdFromHeader(context, cookieName);
        }

        if (tokenId == null) {
            tokenId = getTokenIdFromCookie(context, cookieName);
        }

        // Should any of these actions in the future be allowed to function without an SSO token, this
        // code will have to be moved/changed.
        if (tokenId == null) {
            final BadRequestException e = new BadRequestException("iPlanetDirectoryCookie not set on request");
            LOGGER.message("SessionResource.handleNullSSOToken :: iPlanetDirectoryCookie not set on request", e);
            return e.asPromise();
        }

        return internalHandleAction(tokenId, context, request);
    }
