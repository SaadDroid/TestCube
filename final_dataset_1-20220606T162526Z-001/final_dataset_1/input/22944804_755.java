@Override
    public int getProcessors() throws DataLayerException {
        try {
            int max = dataLayerConfig.getConfig(ConnectionType.CTS_ASYNC).getMaxConnections();
            return findPowerOfTwo(max - 1);
        } catch (IllegalArgumentException e) {
            throw new DataLayerException("Number of connections too low", e);
        } catch (InvalidConfigurationException e) {
            throw new DataLayerException("Configuration was invalid", e);
        }
    }
