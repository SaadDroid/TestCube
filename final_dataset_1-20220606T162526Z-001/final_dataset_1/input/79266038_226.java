@Override
    public List<NativeProcess> getProcesses() {
        return pidEnumerator
            .getPids()
            .stream()
            .map(processCollector::collect)
            .collect(Collectors.toList());
    }
