public void setDeviceOrientation(int deviceOrientation) {
        sanitizeInput(deviceOrientation);
        mDeviceOrientation = deviceOrientation;
        print();
    }
