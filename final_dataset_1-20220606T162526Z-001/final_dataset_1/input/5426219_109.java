public static ImmutableMap<String, OntologyTerm> parse(TsvStreamer tsvStreamer) {
        return tsvStreamer.get()
                .filter(line -> line.length > 2)
                .filter(line -> line[ACCESSION_COLUMN_INDEX].startsWith("IPR"))
                .collect(toImmutableMap(
                        line -> line[ACCESSION_COLUMN_INDEX],
                        line ->
                                OntologyTerm.create(
                                        line[ACCESSION_COLUMN_INDEX],
                                        line[NAME_COLUMN_INDEX] +
                                                " (" + line[TYPE_COLUMN_INDEX].toLowerCase() + ")")));
    }
