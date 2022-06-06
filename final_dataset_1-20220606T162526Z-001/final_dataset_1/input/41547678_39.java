@Override
    public Symbol getInstanceField(String fieldName, Symbol instance) {
        throw new IllegalArgumentException(describe() + " has no field named " + fieldName);
    }
