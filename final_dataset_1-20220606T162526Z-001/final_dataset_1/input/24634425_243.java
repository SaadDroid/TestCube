@Override
    public HardMediumSoftScore calculateScore(ClusterState solution) {
        return HardMediumSoftScore.valueOf(
                calculateHardScore(solution),
                calculateMediumScore(solution),
                -VmPlacementConfig.initialClusterState.get().countVmMigrationsNeeded(solution));
    }
