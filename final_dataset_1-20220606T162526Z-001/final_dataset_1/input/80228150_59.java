@Override
    public byte[] encryptAESGCM(byte[] plainText, SecretKey key, byte[] iv, byte[] aad) throws EncryptionException {
        return new AESGCMEncryption().encrypt(plainText, key, iv, aad);
    }
