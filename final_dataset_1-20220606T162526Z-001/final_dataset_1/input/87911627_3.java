public Concept fill(Concept concept, CsvLine line) throws IllegalArgumentException {
		
		if (!CollectionUtils.isEmpty(concept.getConceptMappings())) {
			concept.getConceptMappings().clear();
		}
		String mappingsStr = line.get(HEADER_MAPPINGS_SAMEAS);
		if (!StringUtils.isEmpty(mappingsStr)) {
			for (ConceptMap mapping : listParser.parseList(mappingsStr)) {
				concept.addConceptMapping(mapping);
			}
		}
		
		return concept;
	}
