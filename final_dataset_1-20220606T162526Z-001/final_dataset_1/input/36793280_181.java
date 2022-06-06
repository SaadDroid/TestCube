@SuppressWarnings("unchecked")
    public synchronized void registerConsumer(String className,
        EventConsumer<? extends T> eventConsumer) {
        this.eventConsumerMap.compute(className, (k, consumers) -> {
            if (consumers == null) {
                consumers = new CopyOnWriteArrayList<>();
                consumers.add((EventConsumer<T>) eventConsumer);
                return consumers;
            } else {
                consumers.add((EventConsumer<T>) eventConsumer);
                return consumers;
            }
        });
        this.consumerRegistered = true;
    }
