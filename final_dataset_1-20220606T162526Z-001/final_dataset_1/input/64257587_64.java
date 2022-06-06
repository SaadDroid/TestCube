@Nullable
    public String getFeatureVariableString(@Nonnull String featureKey,
                                           @Nonnull String variableKey,
                                           @Nonnull String userId) {
        return getFeatureVariableString(featureKey, variableKey, userId, Collections.<String, String>emptyMap());
    }
