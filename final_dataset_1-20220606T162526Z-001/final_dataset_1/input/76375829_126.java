public void setMultitouchInputMax(int count) throws IOException {
        if (count < 1 || count > mChipConfiguration.maxTouch) {
            throw new IllegalArgumentException("Multitouch count must be between 1 and "
                    + mChipConfiguration.maxTouch);
        }

        byte value = mDevice.readRegByte(REG_MTOUCH_CFG);
        // Enable multitouch blocking to cap touches at the maximum value
        value = BitwiseUtil.setBit(value, 7);   // Enable MULT_BLK
        // Configure the maximum number of touch points
        count = (count - 1) << 2;
        value = BitwiseUtil.applyBitRange(value, count, 0x0C); // B_MULT_T bits
        mDevice.writeRegByte(REG_MTOUCH_CFG, value);
    }
