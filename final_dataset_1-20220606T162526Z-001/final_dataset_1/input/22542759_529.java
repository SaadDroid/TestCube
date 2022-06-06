@Override
  public List<MetadataChange> batch(List<? extends MetadataMutation> mutations, MutationOptions options) {
    return execute(context -> mutations.stream()
      .map(mutation -> apply(context, mutation)).collect(Collectors.toList()));
  }
