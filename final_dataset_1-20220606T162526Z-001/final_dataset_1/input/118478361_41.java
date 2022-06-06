@Override
    public List flattenFirstLevel(List list) {
        if (list == null) {
            return null;
        }
        List result = new ArrayList<>();
        for (Object object : list) {
            if (object instanceof List) {
                result.addAll((List) object);
            } else {
                result.add(object);
            }
        }
        return result;
    }
