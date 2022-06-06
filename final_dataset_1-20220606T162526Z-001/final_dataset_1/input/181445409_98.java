@Override
    public Mono<Long> position(Partition partition) {
        Objects.requireNonNull(partition, "Partition cannot be null");

        return delegate.position(toVertxTopicPartition(partition)).convert().with(UniReactorConverters.toMono());
    }
