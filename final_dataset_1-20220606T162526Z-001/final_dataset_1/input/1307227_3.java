public static LoggerStore createLoggerStore(final String configuratorType, final String resource) {
        final InitialLoggerStoreFactory factory = new InitialLoggerStoreFactory();
        final Map<String, Object> data = new HashMap<String, Object>();
        data.put(INITIAL_FACTORY, getFactoryClassName(configuratorType));
        data.put(FILE_LOCATION, resource);
        return factory.createLoggerStore(data);
    }
