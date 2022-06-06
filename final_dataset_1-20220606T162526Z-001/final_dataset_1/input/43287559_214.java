public void addChildElement(TLVElement element) throws TLVParserException {
        Util.notNull(element, "Child TLV element");
        this.children.add(element);
        assertActualContentLengthIsInTLVLimits(getContentLength());
    }
