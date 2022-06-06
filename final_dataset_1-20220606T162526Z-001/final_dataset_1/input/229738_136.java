@SuppressWarnings("unchecked")
    public static Iterator<Object> of(Object iterable) {
        if (iterable == null) {
            throw new IllegalArgumentException("can't iterate null");
        }
        if (iterable instanceof Iterator<?>) {
            return (Iterator<Object>) iterable;
        } else if (iterable instanceof Iterable<?>) {
            return ((Iterable<Object>) iterable).iterator();
        }
        if (iterable instanceof Stream<?>) {
            return ((Stream<Object>) iterable).iterator();
        }

        Class<?> klass = iterable.getClass();
        if (!klass.isArray()) {
            throw new IllegalArgumentException(getTypeWarning(klass));
        }

        if (klass.getComponentType().isPrimitive()) {
            return new PrimitiveArrayIterator(iterable);
        }
        return Arrays.asList((Object[]) iterable).iterator();
    }
