@Nonnull
    public static List<Class<?>> getEntityClasses(@Nonnull final EntityDataStore entityDataStore) {
        Assert.notNull(entityDataStore, "entityDataStore must not be null!");

        return getEntityTypes(entityDataStore)
            .stream()
            .map(Type::getClassType)
            .collect(toList());
    }
