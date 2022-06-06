public static TLVElement create(byte[] bytes) throws TLVParserException {
        Util.notNull(bytes, "Byte array");
        TLVInputStream input = null;
        try {
            input = new TLVInputStream(new ByteArrayInputStream(bytes));
            TLVElement element = input.readElement();
            if (input.hasNextElement()) {
                throw new MultipleTLVElementException();
            }
            return element;
        } catch (IOException e) {
            throw new TLVParserException("Reading TLV bytes failed", e);
        } finally {
            Util.closeQuietly(input);
        }
    }
