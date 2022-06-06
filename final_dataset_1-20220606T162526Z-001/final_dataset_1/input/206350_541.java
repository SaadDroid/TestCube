@Override
    public DateProperty<E> alias(String alias) {
        return PropertyFactory.createDate(alias, this.getExpression(), this.getType());
    }
