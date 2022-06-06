@Override
    public void start() {
        addConnectionStateListener(new ConnectionLostListener());
        addDataListener(new JobPausedStatusJobListener());
        addDataListener(new JobShutdownStatusJobListener());
    }
