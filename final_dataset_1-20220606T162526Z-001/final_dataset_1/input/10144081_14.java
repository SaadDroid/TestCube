public static Optional<Method> getReadMethod(Field field) {
        String fieldName = field.getName();
        Class<?> fieldClass = field.getDeclaringClass();
        String capitalizedFieldName = fieldName.substring(0, 1).toUpperCase(ENGLISH) + fieldName.substring(1);
        // try to find getProperty
        Optional<Method> getter = getPublicMethod("get" + capitalizedFieldName, fieldClass);
        if (getter.isPresent()) {
            return getter;
        }
        // try to find isProperty for boolean properties
        return getPublicMethod("is" + capitalizedFieldName, fieldClass);
    }
