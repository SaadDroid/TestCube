@Override
    public DifferentialExperiment create(ExperimentDTO experimentDTO,
                                         ExperimentDesign experimentDesign,
                                         IdfParserOutput idfParserOutput) {

        String experimentAccession = experimentDTO.getExperimentAccession();

        final ExperimentConfiguration experimentConfiguration =
                configurationTrader.getExperimentConfiguration(experimentAccession);

        return new DifferentialExperiment(
                experimentAccession,
                experimentDTO.getLastUpdate(),
                experimentConfiguration.getContrastAndAnnotationPairs(),
                idfParserOutput.getTitle(),
                speciesFactory.create(experimentDTO.getSpecies()),
                experimentDTO.getPubmedIds(),
                experimentDTO.getDois(),
                experimentDesign);
    }
