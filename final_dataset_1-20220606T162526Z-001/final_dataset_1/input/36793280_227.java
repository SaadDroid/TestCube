@Bean
    public RetryRegistry retryRegistry(RetryConfigurationProperties retryConfigurationProperties,
        EventConsumerRegistry<RetryEvent> retryEventConsumerRegistry,
        RegistryEventConsumer<Retry> retryRegistryEventConsumer,
        @Qualifier("compositeRetryCustomizer") CompositeCustomizer<RetryConfigCustomizer> compositeRetryCustomizer) {
        RetryRegistry retryRegistry = createRetryRegistry(retryConfigurationProperties,
            retryRegistryEventConsumer, compositeRetryCustomizer);
        registerEventConsumer(retryRegistry, retryEventConsumerRegistry,
            retryConfigurationProperties);
        retryConfigurationProperties.getInstances()
            .forEach((name, properties) ->
                retryRegistry.retry(name, retryConfigurationProperties
                    .createRetryConfig(name, compositeRetryCustomizer)));
        return retryRegistry;
    }
