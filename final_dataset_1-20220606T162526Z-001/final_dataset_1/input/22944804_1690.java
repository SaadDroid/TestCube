public Cipher getCipher() {
        return cipherCache.getInstanceForCurrentThread();
    }
