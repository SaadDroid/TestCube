public void update(RoutingContext context) {
        JWT accessToken = context.get(OAuth2AuthHandler.TOKEN_CONTEXT_KEY);
        Client client = context.get(OAuth2AuthHandler.CLIENT_CONTEXT_KEY);
        String resource_id = context.request().getParam(RESOURCE_ID);

        this.extractRequest(context)
                .flatMap(request -> this.resourceService.update(request, domain.getId(), client.getId(), accessToken.getSub(), resource_id))
                .subscribe(
                        resource -> context.response()
                                .putHeader(HttpHeaders.CACHE_CONTROL, "no-store")
                                .putHeader(HttpHeaders.PRAGMA, "no-cache")
                                .putHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                                .setStatusCode(HttpStatusCode.OK_200)
                                .end(Json.encodePrettily(ResourceResponse.from(resource)))
                        , error -> context.fail(error)
                );
    }
