public void destroy() {
        _log.debug("Destroying deployment " + getName());
        
        // Clean up our list of activations, just in case something's left
        _serviceBindings.clear();
        _components.clear();
        _referenceBindings.clear();

        getValidatorRegistryLoader().unregisterValidators();
        getTransformerRegistryLoader().unregisterTransformers();

        getDomain().getEventPublisher().publish(new ApplicationUndeployedEvent(this));
        getDomain().destroy();
    }
