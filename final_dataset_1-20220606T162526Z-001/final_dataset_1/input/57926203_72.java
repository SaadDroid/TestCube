public static Optional<MacAddress> getServiceFunctionMacAddress(String ifName) {
        String theLogicalInterfaceName = SfcGeniusUtilsDataGetter.getServiceFunctionAttachedInterfaceName(ifName)
                        .orElseThrow(() -> new RuntimeException("Interface is not present in the CONFIG DS"));
        Interface theIf = SfcGeniusUtilsDataGetter.getServiceFunctionAttachedInterfaceState(ifName)
                        .orElseThrow(() -> new RuntimeException("Interface is not present in the OPERATIONAL DS"));
        BigInteger theDataplaneId = SfcGeniusUtils.getDpnIdFromLowerLayerIfList(theIf.getLowerLayerIf());

        return SfcGeniusUtilsDataGetter.getBridgeFromDpnId(theDataplaneId)
                    .map(BridgeRefEntry::getBridgeReference)
                    .map(OvsdbBridgeRef::getValue)
                    .map(iid -> iid.firstKeyOf(Node.class))
                    .map(NodeKey::getNodeId)
                    .map(NodeId::getValue)
                    .map(theBridgeName ->
                            SfcGeniusUtilsDataGetter.readOvsNodeInterfaces(theBridgeName, theLogicalInterfaceName))
                    .orElseThrow(() -> new RuntimeException(
                            String.format("Could not get ovsDB information for IF: %s", theLogicalInterfaceName)))
                    .stream()
                        .filter(ifExternalId -> ifExternalId.getExternalIdKey() != null)
                        .filter(theExternalId ->
                                theExternalId.getExternalIdKey().equals(SfcGeniusConstants.MAC_KEY))
                        .map(theMac -> new MacAddress(theMac.getExternalIdValue()))
                .findFirst();
    }
