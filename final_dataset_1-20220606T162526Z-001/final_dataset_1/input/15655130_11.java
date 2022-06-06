public ComponentConfiguration getAvailableComponent() {
        return Iterables.tryFind(components, IS_AVAILABLE).orNull();
    }
