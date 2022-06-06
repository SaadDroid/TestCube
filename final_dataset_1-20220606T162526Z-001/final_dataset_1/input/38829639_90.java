@Override
  public <C extends Namespaceable<C> & KubernetesClient> void create(
    C client, LeaderElectionRecord leaderElectionRecord) throws LockException {

    try {
      client.inNamespace(leaseNamespace).leases().withName(leaseName).createNew()
        .withNewMetadata().withNamespace(leaseNamespace).withName(leaseName).endMetadata()
        .withNewSpec()
        .withHolderIdentity(leaderElectionRecord.getHolderIdentity())
        .withLeaseDurationSeconds((int)leaderElectionRecord.getLeaseDuration().get(ChronoUnit.SECONDS))
        .withAcquireTime(leaderElectionRecord.getAcquireTime())
        .withRenewTime(leaderElectionRecord.getRenewTime())
        .withLeaseTransitions(leaderElectionRecord.getLeaderTransitions())
        .endSpec()
        .done();
    } catch (Exception e) {
      throw new LockException("Unable to create LeaseLock", e);
    }
  }
