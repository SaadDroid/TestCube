@Override
    public ValidationResult isInputValid(final Class<?>... arguments) {
        final ValidationResult result = new ValidationResult();
        if (null == controlValue) {
            result.addError("Control value has not been set");
            return result;
        }

        if (null == arguments || 1 != arguments.length || null == arguments[0]) {
            result.addError("Incorrect number of arguments for " + getClass().getName() + ". 1 argument is required.");
            return result;
        }

        if (!controlValue.getClass().isAssignableFrom(arguments[0])) {
            result.addError("Control value class " + controlValue.getClass().getName() + " is not compatible with the input type: " + arguments[0]);
        }

        return result;
    }
