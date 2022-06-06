public FieldValidator createValidator(Field field, String validatorType, String constraintValue)
    {
        Component component = (Component) field;
        assert InternalUtils.isNonBlank(validatorType);
        ComponentResources componentResources = component.getComponentResources();
        String overrideId = componentResources.getId();

        // So, if you use a TextField on your EditUser page, we want to search the messages
        // of the EditUser page (the container), not the TextField (which will always be the same).

        Messages overrideMessages = componentResources.getContainerMessages();

        return createValidator(field, validatorType, constraintValue, overrideId, overrideMessages, null);
    }
