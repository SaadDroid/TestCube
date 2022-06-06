public FeedDiscovery(Searcher<?> searcher, File resultFilePath, int numThreads, int numResults, boolean csvOutput) {
        Validate.notNull(searcher, "webSearcher must not be null");
        Validate.isTrue(numThreads > 0, "numThreads must be greater zero");
        Validate.isTrue(numResults > 0, "numResults must be greater zero");
        this.searcher = searcher;
        this.resultFilePath = resultFilePath;
        this.numThreads = numThreads;
        this.numResults = numResults;
        this.csvOutput = csvOutput;
    }
