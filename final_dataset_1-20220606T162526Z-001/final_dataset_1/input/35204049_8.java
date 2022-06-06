@Override
    public Map<Object, Object> getNormalizedValue(Object obj) {
        if (obj == null) {
            return null;
        }

        if (obj instanceof String) {
            obj = AtlasType.fromJson(obj.toString(), Map.class);
        }

        if (obj instanceof Map) {
            Map<Object, Object> ret = new HashMap<>();

            Map<Object, Objects> map = (Map<Object, Objects>) obj;

            for (Map.Entry e : map.entrySet()) {
                Object normalizedKey = keyType.getNormalizedValue(e.getKey());

                if (normalizedKey != null) {
                    Object value = e.getValue();

                    if (value != null) {
                        Object normalizedValue = valueType.getNormalizedValue(e.getValue());

                        if (normalizedValue != null) {
                            ret.put(normalizedKey, normalizedValue);
                        } else {
                            return null; // invalid value
                        }
                    } else {
                        ret.put(normalizedKey, value);
                    }
                } else {
                    return null; // invalid key
                }
            }

            return ret;
        }

        return null;
    }
