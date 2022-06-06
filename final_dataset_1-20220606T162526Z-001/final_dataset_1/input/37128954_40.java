public synchronized void startReceiveBluetoothMacAddressMode(String requestId) {
        if (!mIsReceiveBluetoothMacAddressModeStarted) {
            mIsReceiveBluetoothMacAddressModeStarted = true;
            Log.i(TAG, "startReceiveBluetoothMacAddressMode: Starting...");

            if (mReceiveBluetoothMacAddressTimeoutTimer != null) {
                mReceiveBluetoothMacAddressTimeoutTimer.cancel();
                mReceiveBluetoothMacAddressTimeoutTimer = null;
            }

            startBluetoothMacAddressGattServer(requestId); // Starts if not yet started, otherwise does nothing

            if (mSettings.getAutomateBluetoothMacAddressResolution()) {
                long durationInSeconds = mSettings.getProvideBluetoothMacAddressTimeout();

                if (durationInSeconds == 0) {
                    durationInSeconds = DiscoveryManagerSettings.DEFAULT_DEVICE_DISCOVERABLE_DURATION_IN_SECONDS;
                } else {
                    durationInSeconds /= 1000;
                }

                mDiscoveryManager.makeDeviceDiscoverable((int)durationInSeconds);
            }

            long timeoutInMilliseconds = mSettings.getProvideBluetoothMacAddressTimeout();

            mReceiveBluetoothMacAddressTimeoutTimer =
                    new CountDownTimer(timeoutInMilliseconds, timeoutInMilliseconds) {
                        @Override
                        public void onTick(long l) {
                            // Not used
                        }

                        @Override
                        public void onFinish() {
                            Log.d(TAG, "Receive Bluetooth MAC address timeout");
                            this.cancel();
                            mReceiveBluetoothMacAddressTimeoutTimer = null;
                            stopReceiveBluetoothMacAddressMode();
                        }
                    };

            mReceiveBluetoothMacAddressTimeoutTimer.start();
        } else {
            Log.d(TAG, "startReceiveBluetoothMacAddressMode: Already started");
        }
    }
