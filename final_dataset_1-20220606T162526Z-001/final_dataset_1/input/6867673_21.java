@SuppressWarnings("unchecked")
    public KeyValues addAll(final KeyValues keyValues) {
        Validate.notNull(keyValues, "keyValues cannot be null");
        
        final KeyValues res = new KeyValues();
        res.values.putAll(this.values);
        res.values.putAll(keyValues.values);
        return res;
    }
