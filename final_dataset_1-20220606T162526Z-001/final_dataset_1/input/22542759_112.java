public ArtifactConfig read(Id.Namespace namespace, File configFile) throws IOException, InvalidArtifactException {
    String fileName = configFile.getName();
    try (Reader reader = Files.newReader(configFile, Charsets.UTF_8)) {
      try {
        ArtifactConfig config = gsonCache.getUnchecked(namespace).fromJson(reader, ArtifactConfig.class);

        // check namespaces in parents are either system or the specified namespace
        for (ArtifactRange parent : config.getParents()) {
          NamespaceId parentNamespace = new NamespaceId(parent.getNamespace());
          if (!NamespaceId.SYSTEM.equals(parentNamespace) && !namespace.toEntityId().equals(parentNamespace)) {
            throw new InvalidArtifactException(String.format("Invalid parent %s. Parents must be in the same " +
                                                               "namespace or a system artifact.", parent));
          }
        }
        return config;
      } catch (JsonSyntaxException e) {
        throw new InvalidArtifactException(String.format("%s contains invalid json: %s", fileName, e.getMessage()), e);
      } catch (JsonParseException | IllegalArgumentException e) {
        throw new InvalidArtifactException(String.format("Unable to parse %s: %s", fileName, e.getMessage()), e);
      }
    }
  }
