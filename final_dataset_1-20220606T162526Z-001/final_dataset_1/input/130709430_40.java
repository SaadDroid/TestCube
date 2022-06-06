@Override
    public boolean supports(Class<?> clazz) {
        if (clazz.isPrimitive()) {
            return true;
        }
        if (clazz.isInterface()) {
            return clazz.isAnnotation();
        }
        if (clazz.isEnum()) {
            return true;
        }
        return !ReflectionUtils.findMethod(clazz, "toString").getDeclaringClass().equals(Object.class);
    }
