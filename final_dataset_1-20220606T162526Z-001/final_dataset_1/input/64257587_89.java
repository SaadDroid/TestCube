@Nullable
    public Boolean getFeatureVariableBoolean(@Nonnull String featureKey,
                                             @Nonnull String variableKey,
                                             @Nonnull String userId) {
        return getFeatureVariableBoolean(featureKey, variableKey, userId, Collections.<String, String>emptyMap());
    }
