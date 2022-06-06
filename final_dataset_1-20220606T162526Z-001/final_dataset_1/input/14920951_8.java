public static String type(Type t) {
        if (t == null) return NULL_STRING;
        
        if (t instanceof Class) {
            return clazz((Class<?>) t);
        }
        
        if (t instanceof ParameterizedType) {
            return pType((ParameterizedType) t);
        }
        
        return t.toString();
    }
