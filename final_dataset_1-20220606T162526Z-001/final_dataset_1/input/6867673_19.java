@SuppressWarnings("unchecked")
    public KeyValues add(final String key, final String value) {
        Validate.notEmpty(key, "key cannot be empty");
        Validate.notNull(value, "value cannot be null, use an empty string instead");
        
        final KeyValues res = new KeyValues();
        res.values.putAll(this.values);
        res.values.put(key.toLowerCase(), value);
        
        return res;
    }
