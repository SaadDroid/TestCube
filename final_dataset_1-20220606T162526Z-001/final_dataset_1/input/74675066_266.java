@Override
    public void handle(Client client, RoutingContext context, Handler<AsyncResult<Client>> handler) {
        HttpServerRequest request = context.request();
        String clientAssertionType = getClientAssertionType(request);
        String clientAssertion = getClientAssertion(request);
        String clientId = request.getParam(Parameters.CLIENT_ID);
        String basePath = UriBuilderRequest.resolveProxyRequest(context);

        clientAssertionService.assertClient(clientAssertionType, clientAssertion, basePath)
                .flatMap(client1 -> {
                    // clientId is optional, but if provided we must ensure it is the same than the logged client.
                    if(clientId != null && !clientId.equals(client1.getClientId())) {
                        return Maybe.error(new InvalidClientException("client_id parameter does not match with assertion"));
                    }
                    return Maybe.just(client1);
                })
                .subscribe(
                        client1 -> handler.handle(Future.succeededFuture(client1)),
                        throwable -> {
                            if (throwable instanceof InvalidClientException) {
                                logger.debug("Failed to authenticate client with assertion method", throwable);
                                handler.handle(Future.failedFuture(throwable));
                            } else {
                                logger.error("Failed to authenticate client with assertion method", throwable);
                                handler.handle(Future.failedFuture(new InvalidClientException("Invalid client: Failed to authenticate client with assertion method", throwable)));
                            }
                        },
                        () -> handler.handle(Future.failedFuture(new InvalidClientException(ClientAuthHandler.GENERIC_ERROR_MESSAGE)))
                );
    }
