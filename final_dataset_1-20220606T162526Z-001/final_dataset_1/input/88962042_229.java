static Collection<Method> getAllMethods(Class<?> owner, Predicate<? super Method> predicate) {
        return filter(getAll(owner, new Collector<Method>() {
            @Override
            protected Collection<? extends Method> extractFrom(Class<?> type) {
                return ImmutableList.copyOf(type.getDeclaredMethods());
            }
        }), toGuava(predicate));
    }
