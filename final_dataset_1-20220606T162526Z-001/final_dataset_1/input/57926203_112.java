public CompletableFuture<List<String>> readInterfacesOfSf(SfName sfName) {
        InstanceIdentifier<ServiceFunction> sfID = InstanceIdentifier.builder(ServiceFunctions.class)
                .child(ServiceFunction.class, new ServiceFunctionKey(sfName)).build();
        return doRead(LogicalDatastoreType.CONFIGURATION, sfID)
                .thenApply(SfcGeniusSfReader::getInterfacesOfServiceFunction);
    }
