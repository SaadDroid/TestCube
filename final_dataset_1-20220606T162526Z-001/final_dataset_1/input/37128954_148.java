public static String byteArrayToHexString(byte[] bytes, boolean addSpacesBetweenBytes) {
        String hexString = null;

        if (bytes != null && bytes.length > 0) {
            char[] hexCharArray = new char[bytes.length * 2];

            for (int i = 0; i < bytes.length; i++) {
                int v = bytes[i] & 0xFF;
                hexCharArray[i * 2] = HEX_ARRAY[v >>> 4];
                hexCharArray[i * 2 + 1] = HEX_ARRAY[v & 0x0F];
            }

            if (addSpacesBetweenBytes) {
                StringBuilder stringBuilder = new StringBuilder();

                for (int i = 0; i < hexCharArray.length; i += 2) {
                    stringBuilder.append(hexCharArray[i]);
                    stringBuilder.append(hexCharArray[i + 1]);

                    if (i < hexCharArray.length - 2) {
                        stringBuilder.append(" ");
                    }

                    hexString = stringBuilder.toString();
                }
            } else {
                hexString = new String(hexCharArray);
            }
        }

        return hexString;
    }
