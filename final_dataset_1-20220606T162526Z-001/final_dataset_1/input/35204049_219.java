public static <T extends HierarchicalType> List<T> sortTypes(List<T> types) {
        Map<String, T> typesByName = new HashMap<>();
        for (T type : types) {
            typesByName.put(type.name, type);
        }
        List<T> result = new ArrayList<>(types.size());
        Set<T> processed = new HashSet<>();
        for (T type : types) {
            addToResult(type, result, processed, typesByName);
        }
        return result;
    }
