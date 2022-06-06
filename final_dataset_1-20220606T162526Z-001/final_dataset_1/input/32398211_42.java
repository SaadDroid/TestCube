@SuppressWarnings("unchecked")
    public static void removeMapping(String parent, String key, Map<String,Object> data, String currentParent) {
        Iterator<Entry<String, Object>> it = data.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, Object> entry = it.next();
            if (Objects.equals(currentParent, parent) && entry.getKey().equals(key)) {
                it.remove();
            } else if (entry.getValue() instanceof Map) {
                removeMapping(parent, key, (Map<String,Object>) entry.getValue(), entry.getKey());
            } else if (entry.getValue() instanceof List) {
                ((List<Object>) entry.getValue()).stream()
                    .filter(item -> item instanceof Map)
                    .forEach(item -> removeMapping(parent, key, (Map<String,Object>) item, currentParent));
            }
        }
    }
