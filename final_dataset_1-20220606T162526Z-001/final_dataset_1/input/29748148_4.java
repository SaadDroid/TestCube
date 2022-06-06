@Override
    public void onSessionInitiated(ProviderContext session) {
        LOG.info("IetfsyslogProvider Session Initiated");
        this.providerContext = session;
        this.dataService = session.getSALService(DataBroker.class);
        // Register the DataChangeListener for Toaster's configuration subtree
        if (dataService != null) {
            dcReg = dataService.registerDataTreeChangeListener(
                new DataTreeIdentifier<>(LogicalDatastoreType.CONFIGURATION, SYSLOG_IID), this);
        }
        LOG.info("onSessionInitiated: initialization done");
    }
