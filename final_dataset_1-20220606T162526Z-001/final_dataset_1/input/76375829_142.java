public void setBrightness(int value) throws IOException {
        if (mDevice == null) {
            throw new IllegalStateException("I2C device not opened");
        }
        if (value < 0 || value > HT16K33_BRIGHTNESS_MAX) {
            throw new IllegalArgumentException("brightness must be between 0 and " +
                    HT16K33_BRIGHTNESS_MAX);
        }
        mDevice.write(new byte[]{(byte) (HT16K33_CMD_BRIGHTNESS | value)}, 1);
    }
