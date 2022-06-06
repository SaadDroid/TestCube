void setAdvertiseData(AdvertiseData advertiseData) {
        Log.d(TAG, "setAdvertiseData: " + ThreadUtils.currentThreadToString());
        if (advertiseData != null) {
            Log.d(TAG, "setAdvertiseData: " + advertiseData.toString() + ". "
                    + ThreadUtils.currentThreadToString());
            boolean wasStarted = isStarted();
            Log.d(TAG, "setAdvertiseData: was started = " + wasStarted);
            if (wasStarted) {
                stop(false);
            }

            Log.d(TAG, "setAdvertiseData: advertiseData = " + advertiseData.toString());
            // this method is used only from synchronized environment before startAdvertiser()
            mAdvertiseData = advertiseData;

            // in all the cases we manually call start after setting advertise data
            // unnecessary start
            if (wasStarted) {
                start();
            }
        } else {
            throw new IllegalArgumentException("The given advertise data is null");
        }
        Log.d(TAG, "setAdvertiseData finished: " + ThreadUtils.currentThreadToString());
    }
