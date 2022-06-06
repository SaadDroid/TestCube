public boolean isBleMultipleAdvertisementSupported() {
        FeatureSupportChecker checker = new MultipleAdvertisementSupportChecker();
        return checker.isSupported();
    }
