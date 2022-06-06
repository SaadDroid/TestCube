public void setBluetoothMacAddress(String myBluetoothMacAddress) {
        if (BluetoothUtils.isValidBluetoothMacAddress(myBluetoothMacAddress)) {
            Log.d(TAG, "setBluetoothMacAddress: " + myBluetoothMacAddress);
            mMyBluetoothMacAddress = myBluetoothMacAddress;
            mOurRequestId = null;
        } else {
            Log.e(TAG, "setBluetoothMacAddress: The given Bluetooth MAC address is invalid: " + myBluetoothMacAddress);
        }
    }
