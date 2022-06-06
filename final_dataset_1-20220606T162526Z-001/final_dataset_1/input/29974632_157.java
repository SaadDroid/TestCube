@Override
    public SavedSearchConfig merge(final SavedSearchConfig savedSearchConfig) {
        return savedSearchConfig != null ?
                new SavedSearchConfig.Builder()
                        .setPollForUpdates(pollForUpdates == null ? savedSearchConfig.pollForUpdates : pollForUpdates)
                        .setPollingInterval(pollingInterval == null ? savedSearchConfig.pollingInterval : pollingInterval)
                        .build()
                : this;
    }
