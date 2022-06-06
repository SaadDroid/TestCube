@Override
    public List<eu.ascetic.asceticarchitecture.iaas.energymodeller.types.energyuser.Host> getHostList() {
        List<Host> hostsList = client.getAllHosts();
        ArrayList<eu.ascetic.asceticarchitecture.iaas.energymodeller.types.energyuser.Host> hosts = new ArrayList<>();
        for (Host h : hostsList) {
            if (hostFilter.isHost(h)) {
                hosts.add(convert(h));
            }
        }
        return hosts;
    }
