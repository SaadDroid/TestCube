@Override
    public double predictPowerUsed(Host host) {
        if (getDefaultAssumedCpuUsage() == -1) {
            return predictPowerUsed(host, getCpuUtilisation(host));
        } else {
            return predictPowerUsed(host, getDefaultAssumedCpuUsage());
        }
    }
