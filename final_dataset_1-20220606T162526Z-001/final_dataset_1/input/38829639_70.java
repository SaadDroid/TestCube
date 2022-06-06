public LeaderElector<C> build() {
    return new LeaderElector<>(client, leaderElectionConfig);
  }
