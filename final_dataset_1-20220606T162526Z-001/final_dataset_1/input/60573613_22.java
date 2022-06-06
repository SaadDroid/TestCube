@Override
    public void disable(final Optional<String> jobName, final Optional<String> serverIp) {
        jobOperatorTemplate.operate(jobName, serverIp, new JobOperateCallback() {
            
            @Override
            public boolean doOperate(final String jobName, final String serverIp) {
                registryCenter.persist(new JobNodePath(jobName).getServerNodePath(serverIp, JobNodePath.DISABLED_NODE), "");
                return true;
            }
        });
    }
