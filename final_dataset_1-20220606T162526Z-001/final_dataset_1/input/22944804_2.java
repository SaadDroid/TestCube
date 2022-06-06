protected Set<String> calculateDeletedServerDefaults(Map<String, String> existingDefaults,
            Map<String, String> validServerProperties) {
        Set<String> deletedValues = new HashSet<String>();

        for (String existingAttr : existingDefaults.keySet()) {
            int startBracket = existingAttr.indexOf('[');
            if (startBracket != -1) {
                existingAttr = existingAttr.substring(0, startBracket);
            }

            if (!validServerProperties.containsKey(existingAttr)) {
                deletedValues.add(existingAttr);
            }
        }

        return deletedValues;
    }
