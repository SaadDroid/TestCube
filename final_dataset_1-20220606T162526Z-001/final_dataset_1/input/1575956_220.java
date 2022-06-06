public static <T> Class<? extends T> forName(String className,
                                                 Class<T> xface) {

        // Construct the class
        Class<?> theCls;
        try {
            theCls = Class.forName(className);
        } catch (ClassNotFoundException cnfe) {
            throw new RuntimeException(cnfe);
        }
        if (!xface.isAssignableFrom(theCls)) {
            throw new RuntimeException(className + " not " + xface.getName());
        }
        return theCls.asSubclass(xface);
    }
