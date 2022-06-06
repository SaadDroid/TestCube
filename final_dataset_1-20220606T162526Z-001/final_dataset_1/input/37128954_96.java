public static PeerProperties parsedAdvertisementToPeerProperties(
            BlePeerDiscoveryUtils.ParsedAdvertisement parsedAdvertisement) {
        PeerProperties peerProperties = null;

        if (parsedAdvertisement != null) {
            Log.d(TAG, "Parsed advertisment: " + parsedAdvertisement.toString());
            if (parsedAdvertisement.bluetoothMacAddress != null) {
                peerProperties = new PeerProperties(parsedAdvertisement.bluetoothMacAddress,
                        parsedAdvertisement.extraInformation);
            } else {
                Log.e(TAG, "parsedAdvertisementToPeerProperties: No Bluetooth MAC address");
            }
        }

        return peerProperties;
    }
