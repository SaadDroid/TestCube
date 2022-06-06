public MutableEmbeddedComponentModel addEmbeddedComponent(String id, String type, String componentClassName,
                                                              boolean inheritInformalParameters, Location location)
    {
        // TODO: Parent compent model? Or would we simply override the parent?

        if (embeddedComponents == null)
            embeddedComponents = CollectionFactory.newCaseInsensitiveMap();
        else if (embeddedComponents.containsKey(id))
            throw new IllegalArgumentException(String.format("Embedded component '%s' has already been defined for component class %s.", id, this.componentClassName));

        MutableEmbeddedComponentModel embedded = new MutableEmbeddedComponentModelImpl(id, type, componentClassName,
                this.componentClassName, inheritInformalParameters, location);

        embeddedComponents.put(id, embedded);

        return embedded; // So that parameters can be filled in
    }
