@Override
    public DeterministicKeyChain toEncrypted(CharSequence password) {
        checkNotNull(password);
        checkArgument(password.length() > 0);
        checkState(seed != null, "Attempt to encrypt a watching chain.");
        checkState(!seed.isEncrypted());
        KeyCrypter scrypt = new KeyCrypterScrypt();
        KeyParameter derivedKey = scrypt.deriveKey(password);
        return toEncrypted(scrypt, derivedKey);
    }
