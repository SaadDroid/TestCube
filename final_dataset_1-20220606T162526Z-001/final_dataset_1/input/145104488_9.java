public boolean isExpired() {
        return expiration.isBefore(Instant.now());
    }
