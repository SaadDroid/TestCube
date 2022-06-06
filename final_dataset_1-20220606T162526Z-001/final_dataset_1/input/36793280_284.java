@Override
    public Health health() {
        Map<String, Health> healths = rateLimiterRegistry.getAllRateLimiters().toJavaStream()
            .filter(this::isRegisterHealthIndicator)
            .collect(Collectors.toMap(RateLimiter::getName, this::mapRateLimiterHealth));

        Status status = statusAggregator.getAggregateStatus(healths.values().stream().map(Health::getStatus).collect(Collectors.toSet()));
        return Health.status(status).withDetails(healths).build();
    }
