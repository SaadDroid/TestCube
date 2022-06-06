public byte[] perform(byte[] blob) throws TokenStrategyFailedException {
        Reject.ifTrue(blob == null);
        if (!isTokenValidForCompression(blob)) {
            return blob;
        }

        return performUpdate(blob, replacement);
    }
