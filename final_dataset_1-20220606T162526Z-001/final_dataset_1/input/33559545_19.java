@Override
    public CompletableFuture<ClientHttpResponse> call(final Route route) {
        return body(null).call(route);
    }
