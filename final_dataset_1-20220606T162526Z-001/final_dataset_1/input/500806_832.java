@Override
    public void register(ExtensionBuilder builder) {
        if (Validate.classExists(CitrusExtensionConstants.CITRUS)) {
            log.info("Citrus remote extension is active");
            builder.service(TestEnricher.class, CitrusTestEnricher.class);

            builder.observer(CitrusRemoteConfigurationProducer.class);
            builder.observer(CitrusRemoteInstanceProducer.class);
            builder.observer(CitrusRemoteLifecycleHandler.class);
        }
    }
