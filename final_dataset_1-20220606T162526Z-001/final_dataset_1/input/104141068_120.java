@Override
    public MinijaxEntityManager createEntityManager() {
        return new MinijaxEntityManager(this, metamodel, dialect, createConnection());
    }
