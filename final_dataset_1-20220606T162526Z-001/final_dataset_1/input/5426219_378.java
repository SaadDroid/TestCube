String[] buildColumnHeaders(ExperimentType type, ExperimentDesign experimentDesign) {
        List<String> headers = Lists.newArrayList(getCommonColumnHeaders(type));
        headers.addAll(
                toHeaders(
                        experimentDesign.getSampleHeaders(),
                        SAMPLE_CHARACTERISTICS_NAME_HEADER_TEMPLATE,
                        SAMPLE_CHARACTERISTICS_ONTOLOGY_TERM_HEADER_TEMPLATE));
        headers.addAll(toHeaders(
                experimentDesign.getFactorHeaders(),
                FACTOR_NAME_HEADER_TEMPLATE, FACTOR_VALUE_ONTOLOGY_TERM_TEMPLATE));

        return headers.toArray(new String[0]);
    }
