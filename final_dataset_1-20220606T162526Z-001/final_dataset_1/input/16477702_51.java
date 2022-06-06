static void moveAuthTag(byte[] messageKey,
                            byte[] cipherText,
                            byte[] messageKeyWithAuthTag,
                            byte[] cipherTextWithoutAuthTag) {
        // Check dimensions of arrays
        if (messageKeyWithAuthTag.length != messageKey.length + 16) {
            throw new IllegalArgumentException("Length of messageKeyWithAuthTag must be length of messageKey + " +
                    "length of AuthTag (16)");
        }

        if (cipherTextWithoutAuthTag.length != cipherText.length - 16) {
            throw new IllegalArgumentException("Length of cipherTextWithoutAuthTag must be length of cipherText " +
                    "- length of AuthTag (16)");
        }

        // Move auth tag from cipherText to messageKey
        System.arraycopy(messageKey, 0, messageKeyWithAuthTag, 0, 16);
        System.arraycopy(cipherText, 0, cipherTextWithoutAuthTag, 0, cipherTextWithoutAuthTag.length);
        System.arraycopy(cipherText, cipherText.length - 16, messageKeyWithAuthTag, 16, 16);
    }
