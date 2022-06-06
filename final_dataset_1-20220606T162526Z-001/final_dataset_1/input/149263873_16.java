@Nonnull
    public static NamedExpression<?> getKeyExpression(@Nonnull final Class<?> domainClass) {
        Assert.notNull(domainClass, "domainClass must not be null!");
        log.trace("Retrieve Key property. domainClass={}", domainClass.getSimpleName());

        return classKeys
            .computeIfAbsent(domainClass, (clazz) -> {
                Field field = RequeryUtils.findFirstField(clazz, it -> it.getAnnotation(Key.class) != null);
                return (field != null)
                       ? NamedExpression.of(field.getName(), field.getType())
                       : UNKNOWN_KEY_EXPRESSION;
            });
    }
