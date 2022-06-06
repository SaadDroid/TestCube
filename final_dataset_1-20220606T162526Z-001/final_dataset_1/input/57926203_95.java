public CompletableFuture<Void> createTerminatingServiceAction(BigInteger dpnId) {
        short offset = NwConstants.SFC_TRANSPORT_INGRESS_TABLE;
        CreateTerminatingServiceActionsInput input = new CreateTerminatingServiceActionsInputBuilder()
                .setDpnId(dpnId)
                .setInstruction(Collections.singletonList(MDSALUtil.buildAndGetGotoTableInstruction(offset, 0)))
                .setServiceId(SfcGeniusConstants.SFC_VNID)
                .build();
        return CompletableFuture.supplyAsync(() -> {
            try {
                RpcResult<Void> result = itmRpcService.createTerminatingServiceActions(input).get();
                if (!result.isSuccessful()) {
                    throw new SfcGeniusRuntimeException(
                            new RuntimeException(
                                    "Could not add terminating service action on dara plane node " + dpnId,
                                    result.getErrors().stream().findFirst().map(RpcError::getCause).orElse(null)));
                }
            } catch (InterruptedException | ExecutionException e) {
                throw new SfcGeniusRuntimeException(
                        new RuntimeException(
                                "Could not add terminating service action on dara plane node " + dpnId,
                                e));
            }
            return null;
        }, executor);
    }
