protected void verifyDefaultPropertyCanBeSet(ResourceEditProperty property, ContextEntity context) throws ValidationException {
        if (isSameValue(property.getDefaultValue(), property.getPropertyValue())) {
            if (context.isGlobal()) {
                // do not overwrite property value
                throw new ValidationException("The default value of property \"" + property.getPropertyDisplayName() + "\" can not be set on global context");
            }

            if (property.getParent() == null && property.getOriginalValue() == null) {
                throw new ValidationException("The default value of property \"" + property.getPropertyDisplayName() + "\" can not be set unless it overwrites a value defined on a parent context");
            }
        }
    }
