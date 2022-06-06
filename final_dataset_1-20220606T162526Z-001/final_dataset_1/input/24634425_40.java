@Override
    public Collection<Host> getHostCalibrationData(Collection<Host> hosts) {
        for (Host host : hosts) {
            host = getHostCalibrationData(host);
        }
        return hosts;
    }
