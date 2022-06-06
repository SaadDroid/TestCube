public static ServiceFunctionChain readServiceFunctionChain(SfcName serviceFunctionChainName) {
        printTraceStart(LOG);
        ServiceFunctionChain sfc;
        InstanceIdentifier<ServiceFunctionChain> sfcIID;
        ServiceFunctionChainKey serviceFunctionChainKey = new ServiceFunctionChainKey(serviceFunctionChainName);
        sfcIID = InstanceIdentifier.builder(ServiceFunctionChains.class)
            .child(ServiceFunctionChain.class, serviceFunctionChainKey)
            .build();

        sfc = SfcDataStoreAPI.readTransactionAPI(sfcIID, LogicalDatastoreType.CONFIGURATION);

        printTraceStop(LOG);
        return sfc;
    }
