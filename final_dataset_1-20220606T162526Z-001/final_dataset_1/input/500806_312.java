public void validate(String fieldName, String value, List<String> controlParameters, TestContext context) throws ValidationException {
        try {
            int control = Integer.valueOf(StringUtils.trimWhitespace(controlParameters.get(0)));

            if (!(value.length() == control)) {
                throw new ValidationException(this.getClass().getSimpleName()
                        + " failed for field '" + fieldName
                        + "'. Received value '" + value
                        + "' should match string length '" + control + "'.");
            }
        } catch (NumberFormatException e) {
            throw new ValidationException(this.getClass().getSimpleName()
                    + " failed for field '" + fieldName
                    + "'. Invalid matcher argument '" + controlParameters.get(0) + "'. Must be a number");
        }
    }
