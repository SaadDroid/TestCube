public static Hosts rndHosts(int max) {
        int nhosts = rndInt(0, max);
        Hosts hosts = new Hosts();
        hosts.setSticky((Boolean) StubFactory.rndChoice((new Boolean[]{true, false})));
        for (int i = nhosts; i <= StubFactory.rndInt(1, 5); i++) {
            Host h = StubFactory.rndHostPost();
            h.setId(rndInt(0, 10000));
            hosts.getHosts().add(h);

        }
        return hosts;
    }
