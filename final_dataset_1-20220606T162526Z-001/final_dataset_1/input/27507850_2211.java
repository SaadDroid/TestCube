public static Set<String> getFilterNames(Map<String, Configuration> configurations) {
    ImmutableSet.Builder<String> filterNames = ImmutableSet.builder();
    configurations
        .values()
        .forEach(configuration -> filterNames.addAll(configuration.getIpAccessLists().keySet()));
    return filterNames.build();
  }
