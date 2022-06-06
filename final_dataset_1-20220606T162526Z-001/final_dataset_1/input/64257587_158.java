@Nullable
    public <T> T getValue(@Nullable String jsonKey, Class<T> clazz) throws JsonParseException {
        if (!(parser instanceof GsonConfigParser || parser instanceof JacksonConfigParser)) {
            throw new JsonParseException("A proper JSON parser is not available. Use Gson or Jackson parser for this operation.");
        }

        Map<String,Object> subMap = toMap();
        T result = null;

        if (jsonKey == null || jsonKey.isEmpty()) {
            return getValueInternal(subMap, clazz);
        }

        String[] keys = jsonKey.split("\\.", -1);   // -1 to keep trailing empty fields

        for(int i=0; i<keys.length; i++) {
            if (subMap == null) break;

            String key = keys[i];
            if (key.isEmpty()) break;

            if (i == keys.length - 1) {
                result = getValueInternal(subMap.get(key), clazz);
                break;
            }

            if (subMap.get(key) instanceof Map) {
                subMap = (Map<String, Object>) subMap.get(key);
            } else {
                logger.error("Value for JSON key ({}) not found.", jsonKey);
                break;
            }
        }

        if (result == null) {
            logger.error("Value for path could not be assigned to provided schema.");
        }
        return result;
    }
