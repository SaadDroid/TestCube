public CompletableFuture<List<SfpName>> readSfpNames(List<SfName> sfNames) {
        SfcGeniusSfStateReader sfStateReader = getSfStateReader();
        return sfNames.stream()
                .map(sfStateReader::readSfpNames)
                .map(futureList -> futureList.thenApply(List::stream))
                .reduce(CompletableFuture.completedFuture(Stream.empty()),
                        (f1, f2) -> f1.thenCombine(f2, Stream::concat))
                .thenApply(s -> s.distinct().collect(Collectors.toList()));
    }
