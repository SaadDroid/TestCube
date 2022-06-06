Object convertToType(final Type type, final Serializable parameterValue) {
        final Class<? extends Serializable> clazz = getClassFromType(type);
        Serializable preprocessedParameterValue = preprocessInputs(type, parameterValue);
        return convertToType(clazz, preprocessedParameterValue);
    }
