Map<String, String> mapToLinkText(BioentityPropertyName propertyName,
                                      Collection<String> propertyValues,
                                      boolean isPlantSpecies) {
        switch (propertyName) {
            case ORTHOLOG:
                return propertyValues.stream()
                        .collect(toMap(identity(), this::fetchSymbolAndSpeciesForOrtholog));
            case PATHWAYID:
                return isPlantSpecies ?
                        reactomeClient.getPlantPathwayNames(propertyValues) :
                        reactomeClient.getPathwayNames(propertyValues);
            case GO: case PO:
                return propertyValues.stream()
                        .collect(toMap(identity(),
                                       p -> goPoTermTrader.get(p).map(OntologyTerm::name).orElse(p)));
            case INTERPRO:
                return propertyValues.stream()
                        .collect(toMap(identity(),
                                       p -> interProTermTrader.get(p).map(OntologyTerm::name).orElse(p)));
            default:
                return propertyValues.stream().collect(toMap(identity(), identity()));
        }
    }
