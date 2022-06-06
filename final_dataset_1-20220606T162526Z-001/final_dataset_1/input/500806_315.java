public void validate(String fieldName, String value, List<String> controlParameters, TestContext context) throws ValidationException {
        String control = controlParameters.get(0);

        if (!StringUtils.trimWhitespace(value).equalsIgnoreCase(StringUtils.trimWhitespace(control))) {
            throw new ValidationException(this.getClass().getSimpleName()
                    + " failed for field '" + fieldName
                    + "'. Received value is '" + StringUtils.trimWhitespace(value)
                    + "', control value is '" + StringUtils.trimWhitespace(control) + "'.");
        }
    }
