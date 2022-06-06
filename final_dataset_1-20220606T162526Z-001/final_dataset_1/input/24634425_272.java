public int calculateCumulativeUnusedCpuPerc() {
        double cumulativeUnusedCpuPerc = 0;
        for (Host host: hosts) {
            cumulativeUnusedCpuPerc += calculateUnusedCpuRatio(host);
        }
        return (int)(cumulativeUnusedCpuPerc*100);
    }
