public void setBlobFromString(Token token, String blob) {
        Reject.ifNull(token, blob);
        try {
            token.setBlob(fromUTF8(blob));
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException("Failed to encode blob to " + ENCODING, e);
        }
    }
