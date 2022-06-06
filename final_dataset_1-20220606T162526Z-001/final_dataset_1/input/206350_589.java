@Override
    public StringProperty<E> alias(String alias) {
        return PropertyFactory.createString(alias, this.getExpression(), this.getType());
    }
