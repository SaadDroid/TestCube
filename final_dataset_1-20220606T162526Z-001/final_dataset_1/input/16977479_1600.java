@Override
    public UriBuilder matrixParam(String name, Object... values) throws IllegalArgumentException {
        if (name == null || values == null) {
            throw new IllegalArgumentException("name or values is null");
        }
        List<String> list = matrix.get(name);
        if (list == null) {
            matrix.put(name, toStringList(true, values));
        } else {
            list.addAll(toStringList(true, values));
        }
        return this;
    }
