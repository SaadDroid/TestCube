public void validate(Field field, Pattern constraintValue, MessageFormatter formatter, String value)
            throws ValidationException
    {
        Matcher matcher = constraintValue.matcher(value);

        if (!matcher.matches()) throw new ValidationException(buildMessage(formatter, field, constraintValue));
    }
