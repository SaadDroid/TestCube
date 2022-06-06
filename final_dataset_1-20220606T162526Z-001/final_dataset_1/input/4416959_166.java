@SuppressWarnings("unchecked")
    public void validate(Object value) throws ValidationException
    {
        if (!validator.isRequired() && isBlank(value)) return;

        if (value != null && !validator.getValueType().isInstance(value)) return;

        validator.validate(field, constraintValue, messageFormatter, value);
    }
