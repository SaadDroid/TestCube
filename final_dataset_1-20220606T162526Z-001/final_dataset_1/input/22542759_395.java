public void delete(final Id.Artifact artifactId) throws ArtifactNotFoundException, IOException {

    // delete everything in a transaction
    TransactionRunners.run(transactionRunner, context -> {
      // first look up details to get plugins and apps in the artifact
      StructuredTable artifactDataTable = getTable(context, StoreDefinition.ArtifactStore.ARTIFACT_DATA_TABLE);
      ArtifactCell artifactCell = new ArtifactCell(artifactId);
      Optional<StructuredRow> optional = artifactDataTable.read(artifactCell.keys);
      if (!optional.isPresent()) {
        throw new ArtifactNotFoundException(artifactId.toEntityId());
      }
      deleteMeta(context, artifactId,
                 GSON.fromJson(optional.get().getString(StoreDefinition.ArtifactStore.ARTIFACT_DATA_FIELD),
                               ArtifactData.class));
    }, IOException.class, ArtifactNotFoundException.class);
  }
