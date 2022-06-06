public static void putIfAbsent(Map<String, String> map, String name, String value) {
        if (!map.containsKey(name)) {
            map.put(name, value);
        }
    }
