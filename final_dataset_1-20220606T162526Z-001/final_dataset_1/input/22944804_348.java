public synchronized ContextHolder createCachedContextHolder() {
        updateCacheSize();
        while (true) {
            final String key = UUID.randomUUID().toString();

            if (!cache.containsKey(key)) {
                final ContextHolder holder = new ContextHolder(key);
                cache.put(key, holder);
                return holder;
            }
        }
    }
