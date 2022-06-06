@Override
    public Mono<Void> close() {
        return delegate.close().convert().with(UniReactorConverters.toMono());
    }
