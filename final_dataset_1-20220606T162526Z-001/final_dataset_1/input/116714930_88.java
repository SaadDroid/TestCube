public Producer<K, V> getProducer(Properties properties) {
        if (properties == null) {
            throw new IllegalArgumentException("properties cannot be null");
        }

        // Include all default producer properties first, then add in the passed properties
        Properties producerProperties = new Properties();
        producerProperties.putAll(DEFAULT_PRODUCER_PROPERTIES);
        producerProperties.putAll(properties);

        List<Producer<K, V>> producers = null;
        readLock.lock();
        try {
            if (shutdown) {
                throw new IllegalStateException("pool has already been shutdown");
            }
            producers = pool.get(producerProperties);
        } finally {
            readLock.unlock();
        }

        if (producers == null) {
            writeLock.lock();
            try {
                // Check shutdown status again, in case someone else has already shutdown the pool.
                if (shutdown) {
                    throw new IllegalStateException("pool has already been shutdown");
                }

                // Check for existence again, in case someone else beat us here.
                if (pool.containsKey(producerProperties)) {
                    producers = pool.get(producerProperties);
                } else {
                    int producerConcurrency = getProducerConcurrency(producerProperties);

                    // Create a new group of producers.
                    producers = new ArrayList<>(producerConcurrency);
                    for (int i = 0; i < producerConcurrency; ++i) {
                        producers.add(createProducer(producerProperties));
                    }

                    pool.put(producerProperties, producers);
                }
            } finally {
                writeLock.unlock();
            }
        }

        // Return the next producer in the rotation. Make sure we correctly handle max int overflow
        // if invoked that many times in a long running process.
        return producers.get(Math.abs(getProducerRotation()) % producers.size());
    }
