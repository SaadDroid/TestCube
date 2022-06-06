@Bean
    public CircuitBreakerRegistry circuitBreakerRegistry(
        EventConsumerRegistry<CircuitBreakerEvent> eventConsumerRegistry,
        RegistryEventConsumer<CircuitBreaker> circuitBreakerRegistryEventConsumer,
        @Qualifier("compositeCircuitBreakerCustomizer") CompositeCustomizer<CircuitBreakerConfigCustomizer> compositeCircuitBreakerCustomizer) {

        CircuitBreakerRegistry circuitBreakerRegistry = createCircuitBreakerRegistry(
            circuitBreakerProperties, circuitBreakerRegistryEventConsumer,
            compositeCircuitBreakerCustomizer);
        registerEventConsumer(circuitBreakerRegistry, eventConsumerRegistry);
        // then pass the map here
        initCircuitBreakerRegistry(circuitBreakerRegistry, compositeCircuitBreakerCustomizer);
        return circuitBreakerRegistry;
    }
