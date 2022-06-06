ImmutableMap<String, OntologyTerm> parse() throws IOException {

        String startsWithGoPoRegex = "^(" + Joiner.on("|").join(VALID_PREFIXES) + ").+";

        ImmutableMultimap.Builder<String, OntologyTerm> multimapBuilder = ImmutableMultimap.builder();
        String[] line;
        while ((line = csvReader.readNext()) != null) {
            if (line.length > TERM_ACCESSION_COLUMN_INDEX) {
                String accession = line[TERM_ACCESSION_COLUMN_INDEX];
                if (accession.matches(startsWithGoPoRegex)) {
                    String name = line.length > TERM_NAME_COLUMN_INDEX ? line[TERM_NAME_COLUMN_INDEX] : "";
                    int depth = parseDepth(line);
                    multimapBuilder.put(accession, OntologyTerm.create(accession, name, "", depth));
                }
            }
        }
        ImmutableMultimap<String, OntologyTerm> accessionToGoPoTerms = multimapBuilder.build();


        ImmutableMap.Builder<String, OntologyTerm> mapBuilder = ImmutableMap.builder();
        for (String accession : accessionToGoPoTerms.keySet()) {

            int minDepth = minDepthOfTerms(accessionToGoPoTerms.get(accession));
            String name = accessionToGoPoTerms.get(accession).iterator().next().name();

            mapBuilder.put(accession, OntologyTerm.create(accession, name, "", minDepth));
        }

        return mapBuilder.build();
    }
