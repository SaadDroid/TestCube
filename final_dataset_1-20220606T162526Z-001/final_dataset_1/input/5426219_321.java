public static String getBaselineReferenceExperimentAccession(Species species) {
        return REFERENCE_EXPERIMENTS.get(species.getReferenceName());
    }
