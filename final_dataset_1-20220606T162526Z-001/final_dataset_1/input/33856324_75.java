@Override
    public Object decode(InputStream in) throws IOException {
        JsonFactory f = new JsonFactory();
        JsonParser p = f.createParser(in);
        JsonToken token = p.nextToken();
        if (token == JsonToken.VALUE_NULL) {
            return null;
        } else if (token != JsonToken.START_OBJECT) {
            throw new DecodeException("Expected {");
        }
        return dynamicGroupHandler.readValue(p);
    }
