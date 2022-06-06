public static Map<String, ServerLoad> getServersLoadsAfterDeploymentPlanExecuted(DeploymentPlan deploymentPlan,
            List<Host> hosts) {
        Map<String, ServerLoad> serversLoad = new HashMap<>();

        // Initialize the Map with the current server load of each host
        for (Host host: hosts) {
            serversLoad.put(host.getHostname(), new ServerLoad(host.getServerLoad().getCpuLoad(),
                    host.getServerLoad().getRamLoad(), host.getServerLoad().getDiskLoad()));
        }

        // Update the map according to the deployment plan
        for (VmAssignmentToHost vmAssignmentToHost: deploymentPlan.getVmsAssignationsToHosts()) {
            Vm vmAssigned = vmAssignmentToHost.getVm();
            Host deploymentHost = vmAssignmentToHost.getHost();
            double newCpuLoad = serversLoad.get(deploymentHost.getHostname()).getCpuLoad()
                    + (double) vmAssigned.getCpus()/deploymentHost.getTotalCpus();
            double newRamLoad = serversLoad.get(deploymentHost.getHostname()).getRamLoad()
                    + vmAssigned.getRamMb()/deploymentHost.getTotalMemoryMb();
            double newDiskLoad = serversLoad.get(deploymentHost.getHostname()).getDiskLoad()
                    + vmAssigned.getDiskGb()/deploymentHost.getTotalDiskGb();
            serversLoad.put(deploymentHost.getHostname(), new ServerLoad(newCpuLoad, newRamLoad, newDiskLoad));
        }

        return serversLoad;
    }
