public static PersistentStore load(final SagaPersistenceConfiguration persistenceConfiguration) {
        if (!persistenceConfiguration.isEnablePersistence()) {
            return new EmptySagaPersistence();
        }
        PersistentStore result = null;
        for (PersistentStore each : ServiceLoader.load(PersistentStore.class)) {
            result = each;
        }
        if (null == result) {
            result = loadDefaultPersistence(persistenceConfiguration);
        }
        return result;
    }
