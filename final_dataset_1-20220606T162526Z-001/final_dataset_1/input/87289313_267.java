@Override
    public Tuple<?> apply(final Object value) {
        if (isNull(value)) {
            return null;
        }
        if (value instanceof Tuple) {
            return (Tuple<?>) value;
        }

        if (value instanceof Map) {
            return new MapTuple<>(((Map<?, Object>) value));
        }

        if (value instanceof Object[]) {
            return new ArrayTuple(((Object[]) value));
        }

        if (value.getClass().isArray()) {
            if (value instanceof int[]) {
                return new ArrayTuple(ArrayUtils.toObject((int[]) value));
            }
            if (value instanceof double[]) {
                return new ArrayTuple(ArrayUtils.toObject((double[]) value));
            }
            if (value instanceof long[]) {
                return new ArrayTuple(ArrayUtils.toObject((long[]) value));
            }
            if (value instanceof float[]) {
                return new ArrayTuple(ArrayUtils.toObject((float[]) value));
            }
            if (value instanceof short[]) {
                return new ArrayTuple(ArrayUtils.toObject((short[]) value));
            }
            if (value instanceof boolean[]) {
                return new ArrayTuple(ArrayUtils.toObject((boolean[]) value));
            }
            if (value instanceof byte[]) {
                return new ArrayTuple(ArrayUtils.toObject((byte[]) value));
            }
            if (value instanceof char[]) {
                return new ArrayTuple(ArrayUtils.toObject((char[]) value));
            }
        }

        if (value instanceof Iterable) {
            return new ArrayTuple((Iterable) value);
        }

        return new ReflectiveTuple(value);
    }
