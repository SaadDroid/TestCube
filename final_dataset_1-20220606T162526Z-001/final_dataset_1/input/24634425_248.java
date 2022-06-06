public static double getClusterPenaltyScoreForFixedVms(ClusterState clusterState) {
        double result = 0;
        for (Host host: clusterState.getHosts()) {
            if (host.missingFixedVMs(clusterState.getVms())) {
                result -= PENALTY_FOR_MOVING_FIXED_VMS;
            }
        }
        if(result < 0) {
            System.out.println("getClusterPenaltyScoreForFixedVms: " + result);
        }
        return result;
    }
