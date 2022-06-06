@Override
    public Mono<Void> assign(Partition partition) {
        Objects.requireNonNull(partition, "Partition cannot be null");

        return delegate.assign(toVertxTopicPartition(partition)).convert().with(UniReactorConverters.toMono());
    }
