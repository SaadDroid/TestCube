public DependencyGraphTraceBuilderProperties requirements(final Collection<ValueRequirement> requirements) {
    return new DependencyGraphTraceBuilderProperties(this) {
      @Override
      public Collection<ValueRequirement> getRequirements() {
        return requirements;
      }
    };
  }
