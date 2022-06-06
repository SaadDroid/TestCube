public CondensedSdrfParserOutput parse(String experimentAccession, ExperimentType experimentType)
            throws CondensedSdrfParserException {
        ExperimentDesign experimentDesign = new ExperimentDesign();

        // Get sdrf headers if the file exists
        if (dataFileHub.getExperimentFiles(experimentAccession).sdrf.exists()) {
            Map<String, Set<String>> orderedHeaders = sdrfParser.parseHeader(experimentAccession);
            experimentDesign.setOrderedSampleHeaders(orderedHeaders.get("characteristics"));
            experimentDesign.setOrderedFactorHeaders(orderedHeaders.get("factorvalue"));
        }

        ImmutableList.Builder<String[]> factorsBuilder = new ImmutableList.Builder<>();
        ImmutableList.Builder<String[]> sampleCharacteristicsBuilder = new ImmutableList.Builder<>();

        try (TsvStreamer tsvStreamer = dataFileHub.getExperimentFiles(experimentAccession).condensedSdrf.get()) {
            for (Iterator<String[]> tsvIterator = tsvStreamer.get().iterator(); tsvIterator.hasNext();) {
                String[] tsvLine = tsvIterator.next();

                switch (tsvLine[FACTOR_OR_CHARACTERISTIC_INDEX]) {
                    case FACTOR:
                        factorsBuilder.add(tsvLine);
                        break;
                    case CHARACTERISTIC:
                        sampleCharacteristicsBuilder.add(tsvLine);
                        break;
                    default:
                        throw new CondensedSdrfParserException(String.format(
                                "Parsing condensed SDRF for %s: Unknown factor/characteristic descriptor “%s”",
                                experimentAccession, tsvLine[FACTOR_OR_CHARACTERISTIC_INDEX]));
                }
            }
        }

        Multimap<String, String[]> assayRunToTsvLines = mapFactorTsvLinesByAssayRun(factorsBuilder.build());
        addFactorValuesToExperimentDesign(experimentDesign, assayRunToTsvLines);
        addCharacteristicToExperimentDesign(experimentDesign, sampleCharacteristicsBuilder.build());
        String species = parseSpeciesFromCharacteristics(sampleCharacteristicsBuilder.build());

        addArraysToExperimentDesign(experimentDesign, assayRunToTsvLines);


        return new CondensedSdrfParserOutput(
                experimentAccession,
                experimentType,
                experimentDesign,
                species);

    }
