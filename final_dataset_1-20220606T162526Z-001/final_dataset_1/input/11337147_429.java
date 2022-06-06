@Override
    public Filter<? extends Serializable> create(String attribute, String value) {
        return new Filter<>(new Field(attribute, fieldConverter), getTypedValue(attribute, value));
    }
