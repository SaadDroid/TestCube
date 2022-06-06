public static UUID create() {
        final byte[] bytes = new byte[16];

        // Fill with random
        RANDOM.nextBytes(bytes);

        // Set the first 6 bytes / 48 bits to time stamp
        final long time = System.currentTimeMillis();
        for (int i = 0; i < 6; i++) {
            bytes[i] = (byte) ((time >> (40 - i * 8)) & 0xFF);
        }

        return fromBytes(bytes);
    }
