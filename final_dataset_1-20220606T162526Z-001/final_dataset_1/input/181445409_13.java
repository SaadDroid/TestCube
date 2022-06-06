@Override
    public Mono<Void> execute(URI uri, WebSocketHandler handler) {
        return execute(uri, new HttpHeaders(), handler);
    }
