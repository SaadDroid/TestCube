public static Field getFieldAndMakeAccessible(Class<?> clazz, String fieldName) {
        Class<?> searchType = clazz;
        while (!Object.class.equals(searchType) && searchType != null) {
            Field[] fields = searchType.getDeclaredFields();
            for (Field field : fields) {
                if (fieldName == null || fieldName.equals(field.getName())) {
                    field.setAccessible(true);
                    return field;
                }
            }
            searchType = searchType.getSuperclass();
        }
        return null;
    }
