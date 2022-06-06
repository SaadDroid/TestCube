@Override
    public void register() {
        if (isRegistered()) return;
        getGroup().onServerConnect(this);
        setState("ONLINE");
        for (ProxyGroup proxyGroup : TimoCloudCore.getInstance().getInstanceManager().getProxyGroups()) {
            if (!proxyGroup.getServerGroups().contains(getGroup())) continue;
            proxyGroup.registerServer(this);
        }
        this.starting = false;
        this.registered = true;
        TimoCloudCore.getInstance().info("Server " + getName() + " registered.");
        TimoCloudCore.getInstance().getEventManager().fireEvent(new ServerRegisterEvent(toServerObject()));
    }
