public int getWhiteData() throws IOException, IllegalStateException {
        if (mDevice == null) {
            throw new IllegalStateException("device is not connected");
        }
        return (mDevice.readRegWord(REGISTER_WHITE_DATA) & 0xFFFF);
    }
