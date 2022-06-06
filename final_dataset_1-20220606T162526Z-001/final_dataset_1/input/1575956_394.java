public static ManagedChannelBuilder createChannelBuilder(String serviceUri,
                                                             StorageClientSettings settings) {
        ServiceURI uri = ServiceURI.create(serviceUri);

        ManagedChannelBuilder builder;
        if (uri.getServiceInfos().length > 0 && uri.getServiceInfos()[0].equals(BACKEND_INPROCESS)) {
            // this is an inprocess service, so build an inprocess channel.
            String serviceName = uri.getServiceHosts()[0];
            builder = InProcessChannelBuilder.forName(serviceName).directExecutor();
        } else if (null == uri.getServiceName() || ServiceURI.SERVICE_BK.equals(uri.getServiceName())) {
            builder = ManagedChannelBuilder.forTarget(serviceUri)
                .nameResolverFactory(new ServiceNameResolverProvider().toFactory());
        } else {
            NameResolverFactoryProvider provider;
            try {
                provider = ReflectionUtils.newInstance(
                    BK_REG_NAME_RESOLVER_PROVIDER,
                    NameResolverFactoryProvider.class);
            } catch (RuntimeException re) {
                log.error("It seems that you don't have `bk-grpc-name-resolver` in your class path."
                    + " Please make sure you include it as your application's dependency.");
                throw re;
            }
            builder = ManagedChannelBuilder.forTarget(serviceUri)
                .nameResolverFactory(provider.toFactory());
        }
        if (settings.usePlaintext()) {
            builder = builder.usePlaintext();
        }
        return builder;
    }
