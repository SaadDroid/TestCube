@Override
    public ValidationResult isInputValid(final Class<?>... arguments) {
        final ValidationResult result = new ValidationResult();
        if (null == arguments || 2 != arguments.length || null == arguments[0] || null == arguments[1]) {
            result.addError("Incorrect number of arguments for " + getClass().getName() + ". 2 arguments are required.");
            return result;
        }

        if (!arguments[0].equals(arguments[1]) || !Comparable.class.isAssignableFrom(arguments[0])) {
            result.addError("Inputs must be the same class type and comparable: " + arguments[0] + "," + arguments[1]);
        }

        return result;
    }
