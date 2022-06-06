public void create(RoutingContext context) {
        JWT accessToken = context.get(OAuth2AuthHandler.TOKEN_CONTEXT_KEY);
        Client client = context.get(OAuth2AuthHandler.CLIENT_CONTEXT_KEY);
        String basePath = UriBuilderRequest.resolveProxyRequest(context);

        this.extractRequest(context)
                .flatMap(request -> this.resourceService.create(request, domain.getId(), client.getId(), accessToken.getSub()))
                .subscribe(
                        resource -> {
                            final String resourceLocation = resourceLocation(basePath, resource);
                            context.response()
                                    .putHeader(HttpHeaders.CACHE_CONTROL, "no-store")
                                    .putHeader(HttpHeaders.PRAGMA, "no-cache")
                                    .putHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON)
                                    .putHeader(HttpHeaders.LOCATION, resourceLocation)
                                    .setStatusCode(HttpStatusCode.CREATED_201)
                                    .end(Json.encodePrettily(ResourceResponse.from(resource, resourceLocation)));
                        }
                        , error -> context.fail(error)
                );
    }
