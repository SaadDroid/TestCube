Object initComponent(String scopeName, Object component) {
        if (componentMap.get(scopeName) != null && !replaceExisting) {
            logger.d("Existing component for scope: '" + scopeName + "' present. " +
                    "Returning existing instance");
            return componentMap.get(scopeName);
        }
        put(scopeName, component);
        logger.d("No existing component for scope: '" + scopeName + "'. " +
                "Returning provided instance.");
        return component;
    }
