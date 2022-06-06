public static MediaType valueOf(String mType) {
        if (mType == null) {
            throw new IllegalArgumentException("Media type value can not be null");
        }

        MediaType result = map.get(mType);
        if (result == null) {
            result = internalValueOf(mType);
            final int size = map.size();
            if (size >= MAX_MT_CACHE_SIZE) {
                map.clear();
            }
            map.put(mType, result);
        }
        return result;
    }
