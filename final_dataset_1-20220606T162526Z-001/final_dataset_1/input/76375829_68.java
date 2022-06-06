public int readSingleEndedInput(int channel) throws IOException {
        if (channel >= mChipConfiguration.channelCount) {
            throw new IllegalArgumentException("Channel cannot be greater than "
                    + mChipConfiguration.channelCount);
        }

        byte config = MODE_SINGLE_ENDED;
        config |= ((channel & 0x7) << 4);
        byte[] command = {
                0x01, // Start bit
                config, // Configuration bits
                0x00  // Empty clock byte
        };

        byte[] response = new byte[3];
        mDevice.transfer(command, response, 3);
        // Assemble the 10-bit result
        return ((response[1] & 0x3) << 8) | (response[2] & 0xFF);
    }
