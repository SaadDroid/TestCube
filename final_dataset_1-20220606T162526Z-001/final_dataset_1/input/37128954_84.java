public void setAdvertiseSettings(AdvertiseSettings advertiseSettings) {
        Log.d(TAG, "setAdvertiseSettings, " + ThreadUtils.currentThreadToString());
        if (advertiseSettings != null) {
            mAdvertiseSettings = advertiseSettings;

            Log.i(TAG, "setAdvertiseSettings: Mode: " + mAdvertiseSettings.getMode()
                    + ", Tx power level: " + mAdvertiseSettings.getTxPowerLevel()
                    + ", timeout: " + mAdvertiseSettings.getTimeout()
                    + ", is connectable: " + mAdvertiseSettings.isConnectable());
        } else {
            throw new NullPointerException("The argument (AdvertiseSettings) cannot be null");
        }
    }
