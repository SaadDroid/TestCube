public Binding defaultBinding(String parameterName, ComponentResources resources)
    {
        assert InternalUtils.isNonBlank(parameterName);
        assert resources != null;
        String componentId = resources.getId();

        Component container = resources.getContainer();

        // Only provide a default binding if the container actually contains the property.
        // This sets up an error condition for when the parameter is not bound, and
        // the binding can't be deduced.

        if (propertyAccess.getAdapter(container).getPropertyAdapter(componentId) == null)
            return null;

        ComponentResources containerResources = resources.getContainerResources();

        return bindingSource.newBinding(
                "default " + parameterName,
                containerResources,
                BindingConstants.PROP,
                componentId);
    }
