@SuppressWarnings("unchecked")
    public static <T> T getValue(Object object, Member fieldOrMethod) {
        if (fieldOrMethod instanceof Field) {
            return (T)getFieldValue(object, fieldOrMethod);
        } else if (fieldOrMethod instanceof Method) {
            Function<Object, Object> accessor = ACCESSOR_CACHE
                    .computeIfAbsent(fieldOrMethod, key -> new MemberAccessors((Method)key).createFunction());
            return (T)accessor.apply(object);
        } else {
            throw new IllegalArgumentException("Only field or method is supported, found "
                    + fieldOrMethod.getClass().getCanonicalName() + " as type of "
                    + getNameOf(fieldOrMethod));
        }
    }
