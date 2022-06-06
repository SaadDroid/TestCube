@Override
    @SuppressWarnings("unchecked") // SmallRye API returns KafkaConsumer without generics
    public <T> Mono<T> doOnVertxConsumer(Function<io.vertx.kafka.client.consumer.KafkaConsumer<K, V>, T> function) {
        Objects.requireNonNull(function, "Function cannot be null");

        return Mono.create(sink -> {
            try {
                T result = function.apply((io.vertx.kafka.client.consumer.KafkaConsumer<K, V>) delegate.getDelegate());
                sink.success(result);
            } catch (Throwable t) {
                sink.error(t);
            }
        });
    }
