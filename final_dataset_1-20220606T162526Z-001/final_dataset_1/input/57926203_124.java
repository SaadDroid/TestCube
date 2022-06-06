CompletableFuture<Void> unbindFromInterface(String interfaceName) {
        SfcGeniusIfStateReader ifStateReader = getIfStateReader();
        SfcGeniusDpnIfWriter dpnIfWriter = getDpnIfWriter();
        SfcGeniusTsaWriter tsaWriter = getTsaWriter();
        SfcGeniusBoundServiceWriter boundServiceWriter = getBoundServiceWriter();

        LOG.debug("Unbind SFC service from interface {}", interfaceName);

        return CompletableFuture.allOf(
                ifStateReader.readDpnId(interfaceName)
                        .thenCompose(dpnId -> dpnIfWriter.removeInterfaceFromDpn(dpnId, interfaceName))
                        .thenCompose(optionalOldDpn -> optionalOldDpn
                                .map(tsaWriter::removeTerminatingServiceAction)
                                .orElse(CompletableFuture.completedFuture(null))),
                boundServiceWriter.unbindService(interfaceName)
        );
    }
