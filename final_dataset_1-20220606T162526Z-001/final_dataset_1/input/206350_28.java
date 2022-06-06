@SuppressWarnings("deprecation")
    public void configure(Binder binder) {

        // Contribute always to create binding
        ServerModule.contributeProperties(binder);

        binder.bind(ObjectContextFactory.class).to(CayenneContextFactory.class);
        binder.bind(ROPSerializationService.class).toProvider(ClientHessianSerializationServiceProvider.class);
        binder.bind(RemoteService.class).to(ProxyRemoteService.class);
        binder.bind(ClientConnection.class).toProvider(HttpClientConnectionProvider.class);
        binder.bind(EventManager.class).toProvider(EventManagerProvider.class);
        binder.bind(RuntimeProperties.class).to(DefaultRuntimeProperties.class);
        binder.bind(DataChannel.class).toProvider(ClientChannelProvider.class);
        binder.bind(QueryCache.class).toProvider(MapQueryCacheProvider.class);
    }
