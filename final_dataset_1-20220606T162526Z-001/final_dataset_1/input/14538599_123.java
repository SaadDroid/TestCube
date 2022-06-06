@Override
    public Object toColumnValue(Object value) {
        if(value == null) {
            return null;
        }
        return value.toString();
    }
