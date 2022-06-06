protected static byte[] asBytes(String hexString, byte padByte) throws DecryptException {
        byte[] number = new byte[hexString.length() / 2];

        try {
            for (int i = 0; i < hexString.length(); i += 2) {
                int j = Integer.parseInt(hexString.substring(i, i + 2), 16);
                number[i / 2] = (byte) (j & 0x000000ff);
            }
        } catch (StringIndexOutOfBoundsException ex) {
            ex.printStackTrace();
            throw new DecryptException("Invalid hex string");
        }

        return number;
    }
