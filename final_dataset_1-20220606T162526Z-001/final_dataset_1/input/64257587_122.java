@Nonnull
    FeatureDecision getVariationForFeatureInRollout(@Nonnull FeatureFlag featureFlag,
                                                    @Nonnull String userId,
                                                    @Nonnull Map<String, ?> filteredAttributes,
                                                    @Nonnull ProjectConfig projectConfig) {
        // use rollout to get variation for feature
        if (featureFlag.getRolloutId().isEmpty()) {
            logger.info("The feature flag \"{}\" is not used in a rollout.", featureFlag.getKey());
            return new FeatureDecision(null, null, null);
        }
        Rollout rollout = projectConfig.getRolloutIdMapping().get(featureFlag.getRolloutId());
        if (rollout == null) {
            logger.error("The rollout with id \"{}\" was not found in the datafile for feature flag \"{}\".",
                featureFlag.getRolloutId(), featureFlag.getKey());
            return new FeatureDecision(null, null, null);
        }

        // for all rules before the everyone else rule
        int rolloutRulesLength = rollout.getExperiments().size();
        String bucketingId = getBucketingId(userId, filteredAttributes);
        Variation variation;
        for (int i = 0; i < rolloutRulesLength - 1; i++) {
            Experiment rolloutRule = rollout.getExperiments().get(i);
            if (ExperimentUtils.doesUserMeetAudienceConditions(projectConfig, rolloutRule, filteredAttributes, RULE, Integer.toString(i + 1))) {
                variation = bucketer.bucket(rolloutRule, bucketingId, projectConfig);
                if (variation == null) {
                    break;
                }
                return new FeatureDecision(rolloutRule, variation,
                    FeatureDecision.DecisionSource.ROLLOUT);
            } else {
                logger.debug("User \"{}\" does not meet conditions for targeting rule \"{}\".", userId, i + 1);
            }
        }

        // get last rule which is the fall back rule
        Experiment finalRule = rollout.getExperiments().get(rolloutRulesLength - 1);
        if (ExperimentUtils.doesUserMeetAudienceConditions(projectConfig, finalRule, filteredAttributes, RULE, "Everyone Else")) {
            variation = bucketer.bucket(finalRule, bucketingId, projectConfig);
            if (variation != null) {
                logger.debug("User \"{}\" meets conditions for targeting rule \"Everyone Else\".", userId);
                return new FeatureDecision(finalRule, variation,
                    FeatureDecision.DecisionSource.ROLLOUT);
            }
        }
        return new FeatureDecision(null, null, null);
    }
