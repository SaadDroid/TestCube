public static ServiceFunction readServiceFunction(SfName serviceFunctionName) {
        printTraceStart(LOG);
        ServiceFunction sf;
        InstanceIdentifier<ServiceFunction> sfIID;
        ServiceFunctionKey serviceFunctionKey = new ServiceFunctionKey(serviceFunctionName);
        sfIID = InstanceIdentifier.builder(ServiceFunctions.class)
            .child(ServiceFunction.class, serviceFunctionKey)
            .build();

        sf = SfcDataStoreAPI.readTransactionAPI(sfIID, LogicalDatastoreType.CONFIGURATION);

        printTraceStop(LOG);
        return sf;
    }
