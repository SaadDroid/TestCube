static String encryptPbkdf2(String plainText) throws EncryptionException {
        return new PBKDF2Derivation().derive(plainText);
    }
