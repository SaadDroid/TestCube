public Lock acquireLock(K key) {
        if (key == null) {
            throw new NullPointerException("Key must not be null");
        }

        final Key<K> internalKey = new Key<K>(key);
        Lock lock;

        synchronized (lockCache) {
            final Reference<Lock> holder = lockCache.get(internalKey);

            if (holder == null || (lock = holder.get()) == null) {
                lock = new KeyReferenceLock<K>(internalKey);
                // Weak reference is used to ensure consumers
                // maintain the only strong references to the lock.
                lockCache.put(internalKey, new WeakReference<Lock>(lock));
            }
        }

        return lock;
    }
