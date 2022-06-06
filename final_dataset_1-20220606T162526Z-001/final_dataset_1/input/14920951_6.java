public static String clazz(Class<?> clazz) {
        if (clazz == null) return NULL_STRING;
        
        String cn = clazz.getName();
        
        int index = cn.lastIndexOf(DOT);
        if (index < 0) return cn;
        
        // If this fails, the class name somehow ends in dot, which should be illegal
        return cn.substring(index + 1);
    }
