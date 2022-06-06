protected Map<String, Object> groupByProperty(Map<String, Object> data) {
        Map<String, Object> map = new HashMap<>();
        data.entrySet().forEach(entry -> addToMap(map, entry.getKey(), entry.getValue()));
        return map;
    }
