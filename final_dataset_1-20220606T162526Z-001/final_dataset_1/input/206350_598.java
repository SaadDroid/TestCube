public EntityProperty<V> flat() {
        return PropertyFactory.createEntity(ExpressionFactory.fullObjectExp(getExpression()), getEntityType());
    }
