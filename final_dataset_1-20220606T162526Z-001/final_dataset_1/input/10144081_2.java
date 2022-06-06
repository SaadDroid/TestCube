public static List<Field> getInheritedFields(Class<?> type) {
        List<Field> inheritedFields = new ArrayList<>();
        while (type.getSuperclass() != null) {
            Class<?> superclass = type.getSuperclass();
            inheritedFields.addAll(asList(superclass.getDeclaredFields()));
            type = superclass;
        }
        return inheritedFields;
    }
