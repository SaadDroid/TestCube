@Override
    public ScopesConfigurationUnit build() {
        if (scopesMetadata.isEmpty()) {
            return new DefaultScopesConfigurationUnit(getDomainType(), newArrayList(ScopeMetadataUtils.all().defaultScope(true)));
        }

        setDefaultScopeIfNotDefined();

        return new DefaultScopesConfigurationUnit(getDomainType(), scopesMetadata);
    }
