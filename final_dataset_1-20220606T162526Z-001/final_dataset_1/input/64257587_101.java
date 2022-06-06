@Nullable
    public OptimizelyJSON getAllFeatureVariables(@Nonnull String featureKey,
                                                 @Nonnull String userId) {
        return getAllFeatureVariables(featureKey, userId, Collections.<String, String>emptyMap());
    }
