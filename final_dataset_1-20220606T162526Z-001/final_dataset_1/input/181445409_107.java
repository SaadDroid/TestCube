@Override
    public Flux<ConsumerRecord<K, V>> flux() {
        return delegate.toMulti()
            .convert()
            .with(MultiReactorConverters.toFlux())
            .map(SnowdropConsumerRecord::new);
    }
