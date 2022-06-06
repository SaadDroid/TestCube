public Cipher getCipher() {
        try {
            // Use preferred provider if available, otherwise fallback to any provider
            return (preferredProvider != null) ? Cipher.getInstance(transformation, preferredProvider)
                                               : Cipher.getInstance(transformation);
        } catch (NoSuchAlgorithmException ex) {
            DEBUG.error("JCECipherProvider: Algorithm doesn't exist: " + transformation, ex);
        } catch (NoSuchPaddingException ex) {
            DEBUG.error("JCECipherProvider: Padding doesn't exist: " + transformation, ex);
        }
        return null;
    }
