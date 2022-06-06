@Override
    public DeploymentPlan chooseBestDeploymentPlan(List<DeploymentPlan> deploymentPlans, List<Host> hosts,
            String deploymentId) {
        DeploymentPlan bestDeploymentPlan = null;
        for (DeploymentPlan deploymentPlan: deploymentPlans) {
            Collection<ServerLoad> serversLoad =
                    Scheduler.getServersLoadsAfterDeploymentPlanExecuted(deploymentPlan, hosts).values();
            VMMLogger.logServersLoadsAfterDeploymentPlan(deploymentPlan, countIdleServers(serversLoad),
                    Scheduler.calculateStDevCpuLoad(serversLoad), Scheduler.calculateStDevMemLoad(serversLoad),
                    Scheduler.calculateStDevDiskLoad(serversLoad), deploymentId);
            if (bestDeploymentPlan == null || isBetterDeploymentPlan(deploymentPlan, bestDeploymentPlan, hosts)) {
                bestDeploymentPlan = deploymentPlan;
            }
        }
        return bestDeploymentPlan;
    }
