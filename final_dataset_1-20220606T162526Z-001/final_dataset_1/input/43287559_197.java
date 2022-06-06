public final DataHash getDecodedDataHash() throws TLVParserException {
        byte[] content = getContent();
        if (DataHash.isDataHash(content)) {
            return new DataHash(content);
        }
        throw new TLVParserException("Invalid DataHash content");
    }
