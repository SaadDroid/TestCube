public Converter<?> createConverter(String className) {
        if (isClass(String.class, className)) {
            return new StringConverter();
        } else if (isClass(Date.class, className)) {
            return new DateConverter();
        } else if (isClass(Double.class, className)) {
            return new DoubleConverter();
        } else if (isClass(Long.class, className)) {
            return new LongConverter();
        } else if (isClass(Boolean.class, className)) {
            return new BooleanConverter();
        } else if (isClass(Integer.class, className)) {
            return new IntegerConverter();
        }
        throw new UnsupportedOperationException("Canno't create converter for class name : " + className);
    }
