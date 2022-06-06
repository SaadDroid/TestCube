@Override
    public void configure(ServiceProviderBuilder builder) throws Exception {
        SAMLContextProvider samlContextProviderBean = builder.getSharedObject(SAMLContextProvider.class);
        if (samlContextProviderBean == null && !samlContextProviderProperties.getLb().isEnabled()) {
            if (samlContextProvider == null) {
                samlContextProvider = createDefaultSamlContextProvider();
            }
            builder.setSharedObject(SAMLContextProvider.class, samlContextProvider);
        }
    }
