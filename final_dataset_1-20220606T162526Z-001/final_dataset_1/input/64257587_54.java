@Nullable
    public Variation getVariation(@Nonnull Experiment experiment,
                                  @Nonnull String userId) throws UnknownExperimentException {

        return getVariation(experiment, userId, Collections.<String, String>emptyMap());
    }
