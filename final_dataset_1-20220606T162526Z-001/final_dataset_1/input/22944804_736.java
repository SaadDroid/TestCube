public byte[] perform(byte[] blob) throws TokenStrategyFailedException {
        Reject.ifTrue(blob == null);
        try {
            byte[] encryptedBlob = AccessController.doPrivileged(new EncryptAction(blob));

            if (debug.messageEnabled()) {
                debug.message(CoreTokenConstants.DEBUG_HEADER + "Encrypted Token");
            }

            return encryptedBlob;
        } catch (PrivilegedActionException e) {
            throw new TokenStrategyFailedException("Failed to encrypt JSON Blob", e);
        }
    }
