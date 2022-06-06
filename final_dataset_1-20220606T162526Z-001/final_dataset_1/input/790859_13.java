@Override
    public Object transform(Object from) {
        if (from instanceof Node) {
            return transformFromDOMNode((Node) from);
        } else if (from instanceof String) {
            return transformFromInputSource(new InputSource(new StringReader((String) from)));
        } else if (from instanceof char[]) {
            return transformFromInputSource(new InputSource(new StringReader(new String((char[]) from))));
        } else if (from instanceof byte[]) {
            return transformFromInputSource(new InputSource(new ByteArrayInputStream((byte[]) from)));
        } else if (from instanceof Reader) {
            return transformFromInputSource(new InputSource((Reader) from));
        } else if (from instanceof InputStream) {
            return transformFromInputSource(new InputSource((InputStream) from));
        } else if (from instanceof InputSource) {
            return transformFromInputSource((InputSource) from);
        } else if (from instanceof DOMSource) {
            return transformFromDOMSource((DOMSource) from);
        }

        return null;
    }
