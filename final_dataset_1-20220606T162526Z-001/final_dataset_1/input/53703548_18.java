@Override
    public void init(ServiceProviderBuilder builder) throws Exception {
        samlContextProviderProperties = builder.getSharedObject(SAMLSSOProperties.class).getContextProvider();
    }
