@SuppressWarnings("ConstantConditions")
    @Nonnull
    public static EntityModel getEntityModel(@Nonnull final EntityDataStore entityDataStore) {
        Assert.notNull(entityDataStore, "entityDataStore must not be null!");

        try {
            Field field = ReflectionUtils.findField(entityDataStore.getClass(), "entityModel");
            Assert.notNull(field, "entityModel field must not be null!");
            field.setAccessible(true);

            return (EntityModel) ReflectionUtils.getField(field, entityDataStore);
        } catch (Exception e) {
            throw new IllegalStateException("Fail to retrieve entity model.", e);
        }
    }
