@Override
    public String get() {
        try {
            return new String(decrypt(encoded));
        } catch (NoSuchPaddingException | NoSuchAlgorithmException | BadPaddingException | InvalidKeyException | NoSuchProviderException | IllegalBlockSizeException | InvalidAlgorithmParameterException e) {
            throw new AssertionError(e.getMessage());
        }
    }
