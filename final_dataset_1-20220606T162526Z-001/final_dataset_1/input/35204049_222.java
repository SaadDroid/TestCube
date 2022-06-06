@Override
    public boolean has(String typeName) throws AtlasException {

        return types_.containsKey(typeName);
    }
