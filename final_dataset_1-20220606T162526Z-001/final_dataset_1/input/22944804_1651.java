public SAXParser getSAXParser(boolean validating) throws ParserConfigurationException, SAXException {
        try {
            return validating ? validatingParserCache.getInstanceForCurrentThread()
                              : nonValidatingParserCache.getInstanceForCurrentThread();
        } catch (SAXException ex) {
            // Unwrap any parser configuration exceptions and rethrow as correct type
            if (ex.getCause() instanceof ParserConfigurationException) {
                throw (ParserConfigurationException) ex.getCause();
            }
            throw ex;
        }
    }
