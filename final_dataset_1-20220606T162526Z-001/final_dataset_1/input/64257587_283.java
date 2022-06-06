public static boolean doesUserMeetAudienceConditions(@Nonnull ProjectConfig projectConfig,
                                                         @Nonnull Experiment experiment,
                                                         @Nonnull Map<String, ?> attributes,
                                                         @Nonnull String loggingEntityType,
                                                         @Nonnull String loggingKey) {
        if (experiment.getAudienceConditions() != null) {
            logger.debug("Evaluating audiences for {} \"{}\": {}.", loggingEntityType, loggingKey, experiment.getAudienceConditions());
            Boolean resolveReturn = evaluateAudienceConditions(projectConfig, experiment, attributes, loggingEntityType, loggingKey);
            return resolveReturn == null ? false : resolveReturn;
        } else {
            Boolean resolveReturn = evaluateAudience(projectConfig, experiment, attributes, loggingEntityType, loggingKey);
            return Boolean.TRUE.equals(resolveReturn);
        }
    }
