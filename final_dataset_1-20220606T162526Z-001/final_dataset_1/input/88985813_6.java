@VisibleForTesting
    static long updateVersionAndCheckConsistency(long localVersion, long newVersion, String errorMessage) {
        if (localVersion == -1) {
            return newVersion;
        } else {
            if (localVersion != newVersion) {
                throw new UnrecoverableStoreException(errorMessage, args -> args.add("localVersion", localVersion).add("newVersion", newVersion));
            }
        }
        return localVersion;
    }
