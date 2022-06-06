public void beforeSuite(@Observes(precedence = CitrusExtensionConstants.INSTANCE_REMOTE_PRECEDENCE) BeforeSuite event) {
        try {
            log.info("Producing Citrus framework instance");
            citrusInstance.set(Citrus.newInstance(CitrusSpringContext.create(configurationInstance.get().getConfigurationClass())));
        } catch (Exception e) {
            log.error(CitrusExtensionConstants.CITRUS_EXTENSION_ERROR, e);
            throw e;
        }
    }
