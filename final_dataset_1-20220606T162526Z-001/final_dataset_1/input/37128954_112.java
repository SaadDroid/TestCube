@Override
    public void onScanFailed(int errorCode) {
        super.onScanFailed(errorCode);
        String reason = "";
        Log.d(TAG, ThreadUtils.currentThreadToString());
        switch (errorCode) {
            case SCAN_FAILED_ALREADY_STARTED:
                reason = "BLE scan with the same settings is already started by the app";
                Log.e(TAG, "onScanFailed: " + reason + ", error code is " + errorCode);
                try {
                    mBluetoothLeScanner.stopScan(this);
                } catch (IllegalStateException e) {
                    Log.e(TAG, "onScanFailed: stop scan failure " + e.getMessage());
                }
                break;
            case SCAN_FAILED_APPLICATION_REGISTRATION_FAILED:
                reason = "App cannot be registered";
                break;
            case SCAN_FAILED_FEATURE_UNSUPPORTED:
                reason = "Feature is not supported";
                break;
            case SCAN_FAILED_INTERNAL_ERROR:
                reason = "Internal error";
                break;
            default:
                reason = "Unknown error";
                break;
        }

        Log.e(TAG, "onScanFailed: " + reason + ", error code is " + errorCode);
        setState(State.NOT_STARTED, true);

        if (mListener != null) {
            mListener.onScannerFailed(errorCode);
        }
    }
