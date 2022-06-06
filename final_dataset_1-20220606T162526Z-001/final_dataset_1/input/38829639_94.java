@Override
  public <C extends Namespaceable<C> & KubernetesClient> void create(
    C client, LeaderElectionRecord leaderElectionRecord) throws LockException {

    try {
      client.inNamespace(configMapNamespace).configMaps().withName(configMapName).createNew()
        .editOrNewMetadata().withNamespace(configMapNamespace).withName(configMapName)
        .addToAnnotations(LEADER_ELECTION_RECORD_ANNOTATION_KEY, objectMapper.writeValueAsString(leaderElectionRecord))
        .endMetadata()
        .done();
    } catch (Exception e) {
      throw new LockException("Unable to create ConfigMapLock", e);
    }
  }
