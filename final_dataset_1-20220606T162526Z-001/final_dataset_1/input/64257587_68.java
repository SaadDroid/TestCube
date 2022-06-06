@Nullable
    public Integer getFeatureVariableInteger(@Nonnull String featureKey,
                                             @Nonnull String variableKey,
                                             @Nonnull String userId) {
        return getFeatureVariableInteger(featureKey, variableKey, userId, Collections.<String, String>emptyMap());
    }
