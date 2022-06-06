public Component createComponent(ComponentConfiguration configuration, Map<String, StateFactory> stateFactories, Map<String, Stream> inputStreams) {
        try {
            Component component = configuration.retrieveImplementationClass().newInstance();
            setProperties(component, configuration.getProperties());
            setInputStreams(component, inputStreams);
            setTopology(component, tridentTopology);
            setConfiguration(component, config);
            setFeaturesMappers(component, configuration);
            setStateFactories(component, configuration, stateFactories);

            component.init();

            return component;
        } catch (Exception e) {
            throw new IllegalArgumentException("Unable to add component " + configuration.retrieveName(), e);
        }
    }
