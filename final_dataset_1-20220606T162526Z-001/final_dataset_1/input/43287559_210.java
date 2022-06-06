public void setHashAlgorithmContent(HashAlgorithm hashAlgorithm) throws TLVParserException {
        Util.notNull(hashAlgorithm, "Hash algorithm");
        setLongContent((long) hashAlgorithm.getId());
    }
