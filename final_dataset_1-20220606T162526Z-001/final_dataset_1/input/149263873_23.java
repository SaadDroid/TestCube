@SuppressWarnings("unchecked")
    @Nullable
    public static <E> Type<E> getType(@Nonnull final EntityDataStore entityDataStore,
                                      @Nonnull final Class<E> entityClass) {
        Assert.notNull(entityDataStore, "entityDataStore must not be null!");
        Assert.notNull(entityClass, "entityClass must not be null!");

        Set<Type<?>> types = getEntityTypes(entityDataStore);

        return (Type<E>) types
            .stream()
            .filter(it -> entityClass.equals(it.getClassType()))
            .findFirst()
            .orElse(null);
    }
