public void validate(Field field, Long constraintValue, MessageFormatter formatter, Number value)
            throws ValidationException
    {
        if (value.longValue() < constraintValue)
            throw new ValidationException(buildMessage(formatter, field, constraintValue));
    }
