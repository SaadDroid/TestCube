@Override
    public ValidationResult isInputValid(final Class<?>... arguments) {
        final ValidationResult result = new ValidationResult();
        if (null == arguments || 1 != arguments.length || null == arguments[0]) {
            result.addError("Incorrect number of arguments for " + getClass().getName() + ". One (1) argument is required.");
            return result;
        }

        if (!String.class.isAssignableFrom(arguments[0])
                && !Object[].class.isAssignableFrom(arguments[0])
                && !Iterable.class.isAssignableFrom(arguments[0])
                && !Map.class.isAssignableFrom(arguments[0])) {
            result.addError("Input class " + arguments[0].getName() + " must be one of the following: "
                    + String.class.getName() + ", "
                    + Object[].class.getName() + ", "
                    + Iterable.class.getName() + ", "
                    + Map.class.getName());
        }

        return result;
    }
