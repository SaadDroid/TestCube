public CpuInformation getCpu(int cpuIndex) {
        return new CpuInformation(cpuIndex, sigar);
    }
