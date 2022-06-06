@Override
    public Boolean convert(String toBeConverted) {
        if (toBeConverted == null || toBeConverted.isEmpty()) {
            return null;
        }
        return Boolean.valueOf(toBeConverted);
    }
