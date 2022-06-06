public static Header create(String keyName, boolean compressed, boolean withHMAC) {
        byte[] keyNameBytes;
        try {
            keyNameBytes = keyName.getBytes(KEY_NAME_CHARSET);
        } catch (UnsupportedEncodingException e) {
            throw new CayenneCryptoException("Can't encode in " + KEY_NAME_CHARSET, e);
        }

        if (keyNameBytes.length > KEY_NAME_MAX_SIZE) {
            throw new CayenneCryptoException("Key name '" + keyName
                    + "' is too long. Its UTF8-encoded form should not exceed " + KEY_NAME_MAX_SIZE + " bytes");
        }

        int n = MAGIC_NUMBER.length + 1 + 1 + keyNameBytes.length;

        byte[] data = new byte[n];
        System.arraycopy(MAGIC_NUMBER, 0, data, MAGIC_NUMBER_POSITION, MAGIC_NUMBER.length);

        // total header size
        data[SIZE_POSITION] = (byte) n;

        // flags
        if (compressed) {
            data[FLAGS_POSITION] = bitOn(data[FLAGS_POSITION], COMPRESS_BIT);
        }
        if (withHMAC) {
            data[FLAGS_POSITION] = bitOn(data[FLAGS_POSITION], HMAC_BIT);
        }

        // key name
        System.arraycopy(keyNameBytes, 0, data, KEY_NAME_OFFSET, keyNameBytes.length);

        return create(data, 0);
    }
