@Override
    public void updateResourceConfiguration(ConfigurationUpdateReport configurationUpdateReport) {
        updateResourceConfigurationAndRestartIfNecessary(configurationUpdateReport, false);
    }
