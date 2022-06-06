public String extractPassword(Authenticator a, String secret) throws IOException {
        // trim off sign extension bits, and subtract type and length prefix
        final int valLen = ((super.getOctets()[1]) & 0xFF) - 2;
        // octets
        final byte[] cipherText = new byte[valLen];
        System.arraycopy(super.getOctets(), 2, cipherText, 0, valLen);
        final byte[] clearText = UserPasswordAttribute.convert(cipherText, Direction.DECRYPT, secret, a);

        // trim off any null padding
        int i = 0;
        for (; i < clearText.length; i++) {
            if (clearText[i] == 0) {
                break;
            }
        }
        return new String(clearText, 0, i, StandardCharsets.UTF_8);
    }
