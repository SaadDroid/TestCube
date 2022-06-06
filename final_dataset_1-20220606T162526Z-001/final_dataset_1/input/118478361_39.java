@Override
    public<T> List<T> asList(T ...objects) {
        if (objects == null) {
            List<T> result = new ArrayList<>();
            result.add(null);
            return result;
        } else {
            return Arrays.asList(objects);
        }
    }
