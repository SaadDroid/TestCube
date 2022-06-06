public BaselineExperimentProfilesList buildProfilesForExperiments(
            Map<String, Map<String, Double>> expressionsPerColumnPerExperiment, String factorType) {
        return trimAndSort(profilesForExpressions(expressionsPerColumnPerExperiment, factorType));
    }
