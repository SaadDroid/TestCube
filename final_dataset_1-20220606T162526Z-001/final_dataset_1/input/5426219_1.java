public Optional<Integer> getExpectedClusters(String experimentAccession) {
        IdfParserOutput idfParserOutput = idfParser.parse(experimentAccession);

        // Only add preferred cluster property if it exists in the idf file and it is one of the available k values
        if (idfParserOutput.getExpectedClusters() != 0 &&
            getAvailableKs(experimentAccession).contains(idfParserOutput.getExpectedClusters())) {
            return Optional.of(idfParserOutput.getExpectedClusters());
        } else {
            try (TsvStreamer clustersTsvStreamer =
                         dataFileHub.getSingleCellExperimentFiles(experimentAccession).clustersTsv.get()) {
                return clustersTsvStreamer.get()
                        .skip(1)
                        .filter(line -> line[0].equalsIgnoreCase("true"))
                        .map(line -> Integer.parseInt(line[1]))
                        .findFirst();
            }
        }
    }
