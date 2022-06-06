public <E extends Exception> void withReadLock(GuardedRunnable<E> task) throws E {
        lockRead();

        try {
            task.run();
        } finally {
            unlockRead();
        }
    }
