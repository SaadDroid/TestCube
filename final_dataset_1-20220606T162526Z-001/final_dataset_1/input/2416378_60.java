public <T> T merge(Class<? extends T> targetClass, T target, T source) throws MergerException {

        if (target == null) {
            return source;
        } else if (source == null) {
            return target;
        }

        if (!Mergeable.class.isAssignableFrom(targetClass)) {
            return target;
        }

        return (T) mergeMergeable((Class<? extends Mergeable>) targetClass, (Mergeable) target, (Mergeable) source);
    }
