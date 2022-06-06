@Override
    public void basicValidate(final String configSection) throws ConfigException {
        if (dateField == null || dateField.getNormalisedPath().isEmpty()) {
            throw new ConfigException(configSection, "dateField must be provided");
        }

        validateInteger(defaultNumberOfBuckets, "Default number of buckets");
        validateInteger(minNumberOfBuckets, "Minimum number of buckets");
        validateInteger(maxNumberOfBuckets, "Maximum number of buckets");
        validateInteger(numberOfValues, "Number of values");

        if (maxNumberOfBuckets < defaultNumberOfBuckets || minNumberOfBuckets > defaultNumberOfBuckets) {
            throw new ConfigException(configSection, "Default number of buckets must lie between max and min");
        }
    }
