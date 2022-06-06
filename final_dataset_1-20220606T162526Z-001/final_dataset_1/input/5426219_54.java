public Map<ColumnGroup, Set<OntologyTerm>> getAnatomicalSystemsGrouping(Collection<OntologyTerm> ontologyTerms) {
        return getGrouping(ontologyTerms, term -> anatomicalSystemsMap.get().get(term.accession()));
    }
