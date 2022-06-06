public UUID importExperiment(String experimentAccession, boolean isPrivate) {
        checkNotNull(experimentAccession);

        Pair<ExperimentConfiguration, CondensedSdrfParserOutput> files = loadAndValidateFiles(experimentAccession);
        ExperimentConfiguration experimentConfiguration = files.getLeft();
        CondensedSdrfParserOutput condensedSdrfParserOutput = files.getRight();

        IdfParserOutput idfParserOutput = idfParser.parse(experimentAccession);

        Optional<String> accessKey = fetchExperimentAccessKey(experimentAccession);

        ExperimentDTO experimentDTO = ExperimentDTO.create(
                condensedSdrfParserOutput,
                idfParserOutput,
                condensedSdrfParserOutput
                        .getExperimentDesign()
                        .getSpeciesForAssays(
                                experimentConfiguration.getAssayGroups().stream()
                                        .flatMap(assayGroup -> assayGroup.assaysAnalyzedForThisDataColumn().stream())
                                        .collect(Collectors.toSet())),
                isPrivate);

        if (accessKey.isPresent()) {
            deleteExperiment(experimentAccession);
        }

        UUID accessKeyUuid = accessKey.map(UUID::fromString).orElseGet(UUID::randomUUID);
        experimentDao.addExperiment(experimentDTO, accessKeyUuid);

        updateWithNewExperimentDesign(condensedSdrfParserOutput.getExperimentDesign(), experimentDTO);

        return accessKeyUuid;
    }
