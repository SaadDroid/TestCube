public Pair<Optional<Exception>, Optional<JsonArray>> fetchEnrichedGenes(String speciesName,
                                                                             Collection<String> bioentityIdentifiers) {
        try {
            Pair<Optional<String>, Optional<JsonArray>> errorOrResponse =
                    formatResponse(fetchResponse(speciesName, bioentityIdentifiers));
            return errorOrResponse.getLeft().isPresent() ?
                    Pair.of(errorOrResponse.getLeft().map(RuntimeException::new), Optional.empty()) :
                    Pair.of(Optional.empty(), errorOrResponse.getRight());
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
            return Pair.of(Optional.of(e), Optional.empty());
        }
    }
