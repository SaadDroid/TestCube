public OpenAPI read(Class<?> cls) {
        return read(cls, resolveApplicationPath(), null, false, null, null, new LinkedHashSet<String>(), new ArrayList<Parameter>(), new HashSet<Class<?>>());
    }
