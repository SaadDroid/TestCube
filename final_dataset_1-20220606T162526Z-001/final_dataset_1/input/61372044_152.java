public static List<String> flattenProperties(final Object target, final Class<?> clazz) {
        return flattenPropeties(target, clazz, "class");
    }
