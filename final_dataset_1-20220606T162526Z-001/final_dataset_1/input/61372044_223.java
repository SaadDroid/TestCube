public Map<String, String> getDetails() {
        Map<String, String> detailsMap = null;
        if (details != null && !details.isEmpty()) {
            detailsMap = new HashMap<>();
            for (final Map<String, String> detail : details.values()) {
                detailsMap.put(detail.get("key"), detail.get("value"));
            }
        }
        return detailsMap;
    }
