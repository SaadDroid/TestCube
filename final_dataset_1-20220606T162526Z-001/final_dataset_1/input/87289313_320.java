@Override
    public List<?> apply(final Object value) {
        if (null == value) {
            return Lists.newArrayList((Object) null);
        }

        if (value instanceof Object[]) {
            return Lists.newArrayList((Object[]) value);
        }

        if (value instanceof Iterable) {
            if (value instanceof List) {
                return (List<?>) value;
            }
            return Lists.newArrayList((Iterable) value);
        }

        return Lists.newArrayList(value);
    }
