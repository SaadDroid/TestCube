@Nonnull
    public Boolean isFeatureEnabled(@Nonnull String featureKey,
                                    @Nonnull String userId) {
        return isFeatureEnabled(featureKey, userId, Collections.<String, String>emptyMap());
    }
