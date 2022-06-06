public double getUnusedCpuPerc() {
        return cpuLoad > 1 ? 0 : (1 - cpuLoad);
    }
