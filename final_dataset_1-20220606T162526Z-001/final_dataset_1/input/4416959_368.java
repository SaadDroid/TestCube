public Binding newBinding(String description, ComponentResources container,
                              ComponentResources component, String expression, Location location)
    {
        Object target = container.getComponent();
        Class targetClass = target.getClass();

        PropertyConduit conduit = source.create(targetClass, expression);

        String toString = interner.format("PropBinding[%s %s(%s)]", description, container
                .getCompleteId(), expression);

        return new PropBinding(location, target, conduit, expression, toString);
    }
