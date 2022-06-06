public CompletableFuture<RenderedServicePath> readRsp(RspName rspName) {
        InstanceIdentifier<RenderedServicePath> rspID = InstanceIdentifier.builder(RenderedServicePaths.class)
                .child(RenderedServicePath.class, new RenderedServicePathKey(rspName))
                .build();
        return doRead(LogicalDatastoreType.OPERATIONAL, rspID);
    }
