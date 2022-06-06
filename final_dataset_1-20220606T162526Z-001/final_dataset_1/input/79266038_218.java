@Override
    public String readStringUTF8(NativeProcess process, int offset, int maxCodeUnitsToRead) {
        if (maxCodeUnitsToRead < 1) {
            throw new IllegalArgumentException("Cannot read strings shorter than 1 character!");
        }

        byte[] buffer = new byte[maxCodeUnitsToRead];
        int bytesRead = 0;

        for (int i = 0; i < maxCodeUnitsToRead; i++) {
            byte readByte = readByte(process, offset + i);
            if (readByte == 0) {
                // read until null character is met or maxLength is met
                break;
            }
            buffer[i] = readByte;
            bytesRead++;
        }

        return new String(buffer, 0, bytesRead, StandardCharsets.UTF_8);
    }
