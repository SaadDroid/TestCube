public static boolean isInstantiableCollectionType(Class<?> type) {
        if (type == null) {
            throw new IllegalArgumentException("Method argument type must not be null.");
        }

        for (Class<?> supportedType : getInstantiableCollectionTypes()) {
            if (type.isAssignableFrom(supportedType)) {
                return true;
            }
        }

        return false;
    }
