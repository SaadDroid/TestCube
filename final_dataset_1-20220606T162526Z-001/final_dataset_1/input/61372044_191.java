public boolean checkNetwork(final String networkName) {
        if (networkName == null) {
            return true;
        }

        if (getBridgeType() == OPENVSWITCH) {
            return checkOvsNetwork(networkName);
        } else {
            return checkBridgeNetwork(networkName);
        }
    }
