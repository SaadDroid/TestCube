@Override
    public ConstrainedAgEntity<T> apply(AgEntity<T> agEntity) {
        return op.apply(new ConstrainedAgEntity<T>(agEntity));
    }
