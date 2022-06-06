static String encodeBytes(BytesType bytesType) {
        byte[] value = bytesType.getValue();
        int length = value.length;
        int mod = length % Type.MAX_BYTE_LENGTH;

        byte[] dest;
        if (mod != 0) {
            int padding = Type.MAX_BYTE_LENGTH - mod;
            dest = new byte[length + padding];
            System.arraycopy(value, 0, dest, 0, length);
        } else {
            dest = value;
        }
        return Numeric.toHexStringNoPrefix(dest);
    }
