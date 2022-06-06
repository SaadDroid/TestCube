public static String toJson(Collection<?> collection) {
        if (collection == null) {
            throw new IllegalArgumentException("Method parameter collection must not be null");
        }

        return collection.stream()
                .map(JsonUtil::toJson)
                .reduce((l, r) -> l + "," + r)
                .map(s -> '[' + s + ']')
                .orElse("[]");
    }
