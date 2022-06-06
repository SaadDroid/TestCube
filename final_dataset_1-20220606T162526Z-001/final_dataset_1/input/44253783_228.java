public Collection<String> getArtifactIdentifiers() {
    return new TreeSet<String>(componentVersions.stream().map(v -> v.artifactIdentifier()).collect(Collectors.toSet()));
  }
