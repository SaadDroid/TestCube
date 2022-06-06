public static PduFactory withAggregatorConfListener(PduVersion pduVersion, ConfigurationListener<AggregatorConfiguration> aggregatorConfigurationListener) {
        return get(pduVersion, aggregatorConfigurationListener, null);
    }
