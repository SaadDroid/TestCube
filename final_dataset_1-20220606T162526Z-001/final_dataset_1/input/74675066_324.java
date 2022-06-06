@Override
    public void handle(RoutingContext context) {

        //Do not apply security check if open dynamic client registration is enabled.
        if(domain.isOpenDynamicClientRegistrationEnabled()) {
            LOGGER.debug("Open Dynamic client registration is enabled - no security will be performed.");
            context.next();
            return;
        }

        //1st check if dynamic client registration is enabled.
        if(!domain.isDynamicClientRegistrationEnabled()) {
            LOGGER.debug("Dynamic client registration is disabled");
            context.fail(new ClientRegistrationForbiddenException());
            return;
        }

        this.oAuth2AuthHandler.handle(context);
    }
