public void acquire() throws OverCapacityException {
        if (!streamLimiter.acquire()) {
            throw new OverCapacityException(String.format("Stream write capacity exceeded for stream %s", streamName));
        }
        try {
            if (!globalLimiter.acquire()) {
                throw new OverCapacityException("Global write capacity exceeded");
            }
        } catch (OverCapacityException ex) {
            streamLimiter.release(1);
            throw ex;
        }
    }
