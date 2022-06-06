@VisibleForTesting
    Map<String, List<FeatureVariable>> generateFeatureKeyToVariablesMap() {
        List<FeatureFlag> featureFlags = projectConfig.getFeatureFlags();
        if (featureFlags == null) {
            return Collections.emptyMap();
        }
        Map<String, List<FeatureVariable>> featureVariableIdMap = new HashMap<>();
        for (FeatureFlag featureFlag : featureFlags) {
            featureVariableIdMap.put(featureFlag.getKey(), featureFlag.getVariables());
        }
        return featureVariableIdMap;
    }
