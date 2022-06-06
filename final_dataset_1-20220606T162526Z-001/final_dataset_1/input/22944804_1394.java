@Override
    public AuditEventHandler create(AuditEventHandlerConfiguration configuration) throws AuditException {
        Map<String, Set<String>> attributes = configuration.getAttributes();

        CsvAuditEventHandlerConfiguration csvHandlerConfiguration = new CsvAuditEventHandlerConfiguration();
        String location = getMapAttr(attributes, "location");
        csvHandlerConfiguration.setLogDirectory(location.replaceAll("%BASE_DIR%", SystemProperties.get(CONFIG_PATH)).
                replaceAll("%SERVER_URI%", SystemProperties.get(AM_SERVICES_DEPLOYMENT_DESCRIPTOR)));
        csvHandlerConfiguration.setTopics(attributes.get("topics"));
        csvHandlerConfiguration.setName(configuration.getHandlerName());
        csvHandlerConfiguration.setEnabled(getBooleanMapAttr(attributes, "enabled", true));
        setFileRotationPolicies(csvHandlerConfiguration, attributes);
        setFileRetentionPolicies(csvHandlerConfiguration, attributes);
        csvHandlerConfiguration.setBufferingConfiguration(getBufferingConfiguration(attributes));
        csvHandlerConfiguration.setSecurity(getCsvSecurity(attributes));

        return new CsvAuditEventHandler(csvHandlerConfiguration, configuration.getEventTopicsMetaData(),
                new DefaultKeyStoreHandlerProvider());
    }
