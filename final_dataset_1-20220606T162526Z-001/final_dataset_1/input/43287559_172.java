public TLVElement getResult() throws KSIException {
        return parse(responseCode, responseMessage, new ByteArrayInputStream(response));
    }
