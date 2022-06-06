static byte setBit(byte value, int bitIndex) {
        return (byte)((value | (1 << bitIndex)) & 0xFF);
    }
