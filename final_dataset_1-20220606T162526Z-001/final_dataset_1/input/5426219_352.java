public Stream<Condition> getConditions(BaselineExperiment experiment) {
        ImmutableSetMultimap<String, String> assayAccession2OntologyTerms =
                mapAssayAccessionsToOntologyTerms(experiment.getExperimentDesign());

        return experiment.getDataColumnDescriptors().stream()
                .flatMap(assayGroup ->
                        assayGroup.assaysAnalyzedForThisDataColumn().stream()
                                .map(assayAccession ->
                                        new Condition(
                                                experiment.getAccession(),
                                                assayGroup.getId(),
                                                collectAssayProperties(
                                                        experiment,
                                                        assayAccession,
                                                        assayAccession2OntologyTerms.get(assayAccession)))));
    }
