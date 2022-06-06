public static ComputationTargetRequirement of(final ExternalId identifier) {
    return new ComputationTargetRequirement(ComputationTargetType.PRIMITIVE, identifier);
  }
