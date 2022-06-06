JsonArray groupOrganismPartOntologyTerms(Collection<OntologyTerm> ontologyTermsInAllFactors) {
        JsonArray result = new JsonArray();

        groupingAsJson(
                organismPartGroupingService.getOrgansGrouping(ontologyTermsInAllFactors),
                "Organs",
                "Organ")
                .ifPresent(result::add);

        groupingAsJson(
                organismPartGroupingService.getAnatomicalSystemsGrouping(ontologyTermsInAllFactors),
                "Anatomical Systems",
                "Anatomical system")
                .ifPresent(result::add);

        return result;
    }
