public Collection<BlobStrategy> getStrategies(CoreTokenConfig config) {
        List<BlobStrategy> strategies = new ArrayList<BlobStrategy>();
        if (config.isAttributeNamesCompressed()) {
            strategies.add(attributeCompression);
        }
        if (config.isTokenCompressed()) {
            strategies.add(compression);
        }
        if (config.isTokenEncrypted()) {
            strategies.add(encryption);
        }
        return strategies;
    }
