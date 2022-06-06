@Override
    public DeploymentPlan chooseBestDeploymentPlan(List<DeploymentPlan> deploymentPlans, List<Host> hosts,
            String deploymentId) {
        DeploymentPlan bestDeploymentPlan = null;
        for (DeploymentPlan deploymentPlan: deploymentPlans) {
            Collection<ServerLoad> serversLoad =
                    Scheduler.getServersLoadsAfterDeploymentPlanExecuted(deploymentPlan, hosts).values();
            VMMLogger.logUnusedServerLoadsAfterDeploymentPlan(deploymentPlan, countIdleServers(serversLoad),
                    Scheduler.getTotalUnusedCpuPerc(serversLoad), Scheduler.getTotalUnusedMemPerc(serversLoad),
                    Scheduler.getTotalUnusedDiskPerc(serversLoad), deploymentId);
            if (bestDeploymentPlan == null || isBetterDeploymentPlan(deploymentPlan, bestDeploymentPlan, hosts)) {
                bestDeploymentPlan = deploymentPlan;
            }
        }
        return bestDeploymentPlan;
    }
