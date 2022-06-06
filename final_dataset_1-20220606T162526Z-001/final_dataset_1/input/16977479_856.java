void acknowledge(DestinationSequence ds) throws RMException {
        final ProtocolVariation protocol = ds.getProtocol();
        String address = ds.getAcksTo().getAddress().getValue();
        if (RMUtils.getAddressingConstants().getAnonymousURI().equals(address)) {
            LOG.log(Level.WARNING, "STANDALONE_ANON_ACKS_NOT_SUPPORTED");
            return;
        }
        RMConstants constants = protocol.getConstants();
        OperationInfo oi = reliableEndpoint.getEndpoint(protocol).getEndpointInfo()
            .getService().getInterface().getOperation(constants.getSequenceAckOperationName());
        invoke(oi, protocol, new Object[] {ds}, this.sequenceContext);
    }
