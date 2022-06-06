@Nullable
    public Variation activate(@Nonnull String experimentKey,
                              @Nonnull String userId) throws UnknownExperimentException {
        return activate(experimentKey, userId, Collections.<String, String>emptyMap());
    }
