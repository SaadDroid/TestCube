public TimeLimiterConfig createTimeLimiterConfig(String backendName,
        @Nullable InstanceProperties instanceProperties,
        CompositeCustomizer<TimeLimiterConfigCustomizer> compositeTimeLimiterCustomizer) {
        if (instanceProperties == null) {
            return TimeLimiterConfig.ofDefaults();
        }
        if (StringUtils.isNotEmpty(instanceProperties.getBaseConfig())) {
            InstanceProperties baseProperties = configs.get(instanceProperties.getBaseConfig());
            if (baseProperties == null) {
                throw new ConfigurationNotFoundException(instanceProperties.getBaseConfig());
            }
            return buildConfigFromBaseConfig(baseProperties, instanceProperties,
                compositeTimeLimiterCustomizer, backendName);
        }
        return buildTimeLimiterConfig(TimeLimiterConfig.custom(), instanceProperties,
            compositeTimeLimiterCustomizer, backendName);
    }
