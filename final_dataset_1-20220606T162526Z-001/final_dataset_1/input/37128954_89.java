public static AdvertiseData createAdvertiseDataToServiceData(
            UUID serviceUuid, int beaconAdExtraInformation, String bluetoothMacAddress) {
        AdvertiseData.Builder builder = new AdvertiseData.Builder();

        return PeerAdvertisementFactory.createAdvertiseDataToServiceData(
                serviceUuid, beaconAdExtraInformation, bluetoothMacAddress, builder);

    }
