boolean isAllowedGraph(UID context) {
        return !context.getId().startsWith(INTERNAL_PREFIX)
                && !context.getId().equals("http://localhost:8890/DAV")
                && !context.getId().equals(RDF.NS)
                && !context.getId().equals(RDFS.NS)
                && !context.getId().equals(OWL.NS)
                && (context.equals(defaultGraph) || allowedGraphs.isEmpty() || allowedGraphs.contains(context));
    }
