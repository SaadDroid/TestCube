public static PropertyDescriptor getPropertyDescriptor(Class<?> clazz, String property) {
        if (!propertyDescriptors.containsKey(clazz)) {
            getPropertyDescriptors(clazz);
        }
        return propertyDescriptors.get(clazz).get(property);
    }
