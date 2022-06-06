@Override
    public EntityManager create(final String persistenceUnitName)
    {
        return getEntityManagerFactory(persistenceUnitName).createEntityManager();
    }
