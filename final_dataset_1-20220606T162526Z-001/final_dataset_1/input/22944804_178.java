@Override
    @SuppressWarnings("unchecked")
    public <C extends SelfServiceConsoleConfig> ServiceConfigProvider<C> getProvider(C config) {
        String providerClassName = config.getConfigProviderClass();
        ServiceConfigProvider<?> provider = providers.get(providerClassName);

        if (provider == null) {
            provider = constructNewProvider(providerClassName);
            ServiceConfigProvider<?> old = providers.putIfAbsent(providerClassName, provider);

            if (old != null) {
                provider = old;
            }
        }

        return (ServiceConfigProvider<C>) provider;
    }
