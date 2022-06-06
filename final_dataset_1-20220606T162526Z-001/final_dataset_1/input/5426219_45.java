Map<String, Map<Contrast, Integer>> getPercentileRanks(E experiment) {
        return readPercentileRanks(
                experiment,
                dataFileHub.getDifferentialExperimentFiles(experiment.getAccession()).percentileRanks.get());
    }
