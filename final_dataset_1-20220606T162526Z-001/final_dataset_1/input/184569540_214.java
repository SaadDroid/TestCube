@Override
    public void create(PlatformMode platformMode, KubernetesListBuilder builder) {
        addAnnotations(builder);
        addConfigMapFromXmlConfigurations(builder);
    }
