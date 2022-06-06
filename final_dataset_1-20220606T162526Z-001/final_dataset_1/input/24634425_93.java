public int getTotalNumberOfCpusInOnServers() {
        int result = 0;
        for (Host host: getOnHosts()) {
            result += host.getTotalCpus();
        }
        return result;
    }
