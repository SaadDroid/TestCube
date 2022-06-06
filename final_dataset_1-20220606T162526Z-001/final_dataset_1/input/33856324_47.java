@Override
    public Object decode(InputStream in) throws IOException {
        try {
            saxParser.parse(in, saxHandler);
            return saxHandler.getValue();
        } catch (SAXException e) {
            throw new DecodeException(e);
        }
    }
