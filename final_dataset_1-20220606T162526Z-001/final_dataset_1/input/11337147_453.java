@Override
    public String convert(final String attribute) {
        return MapUtil.getMandatory(mapping, attribute);
    }
