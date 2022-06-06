boolean cellLineAsSampleCharacteristicButNoDiseaseAsFactor(ExperimentDesign experimentDesign) {
        return (experimentDesign.getSampleHeaders().contains("cell line") ||
                experimentDesign.getFactorHeaders().contains("cell line"))  &&
                !experimentDesign.getFactorHeaders().contains("disease");
    }
