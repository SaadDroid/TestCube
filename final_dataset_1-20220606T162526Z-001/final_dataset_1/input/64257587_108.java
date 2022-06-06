public boolean setForcedVariation(@Nonnull String experimentKey,
                                      @Nonnull String userId,
                                      @Nullable String variationKey) {
        ProjectConfig projectConfig = getProjectConfig();
        if (projectConfig == null) {
            logger.error("Optimizely instance is not valid, failing isFeatureEnabled call.");
            return false;
        }

        // if the experiment is not a valid experiment key, don't set it.
        Experiment experiment = projectConfig.getExperimentKeyMapping().get(experimentKey);
        if (experiment == null) {
            logger.error("Experiment {} does not exist in ProjectConfig for project {}", experimentKey, projectConfig.getProjectId());
            return false;
        }

        // TODO this is problematic if swapping out ProjectConfigs.
        // This state should be represented elsewhere like in a ephemeral UserProfileService.
        return decisionService.setForcedVariation(experiment, userId, variationKey);
    }
