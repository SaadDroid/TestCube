@Override
    public Collection<String> remove(final Optional<String> jobName, final Optional<String> serverIp) {
        return jobOperatorTemplate.operate(jobName, serverIp, new JobOperateCallback() {
            
            @Override
            public boolean doOperate(final String jobName, final String serverIp) {
                JobNodePath jobNodePath = new JobNodePath(jobName);
                if (registryCenter.isExisted(jobNodePath.getServerNodePath(serverIp, JobNodePath.STATUS_NODE))) {
                    return false;
                }
                registryCenter.remove(jobNodePath.getServerNodePath(serverIp));
                if (registryCenter.getChildrenKeys(jobNodePath.getServerNodePath()).isEmpty()) {
                    registryCenter.remove("/" + jobName);
                }
                return true;
            }
        });
    }
