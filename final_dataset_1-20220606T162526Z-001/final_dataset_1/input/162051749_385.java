@Deprecated
    public FeatureRanking rankFeatures(Iterable<? extends Instance> trainSet,
            Iterable<? extends Instance> validationSet, ProgressReporter progress) {
    	return rankFeatures(new DefaultDataset(trainSet), new DefaultDataset(validationSet), progress);
    }
