@Override
    public CompletableFuture<Iterator<String>> getLogs(String logNamePrefix) {
        if (!"".equals(logNamePrefix)) {
            return FutureUtils.exception(
                new UnexpectedException("Get logs by prefix is not supported by federated metadata store"));
        }

        if (duplicatedLogFound.get()) {
            return duplicatedLogException(duplicatedLogName.get());
        }
        return postStateCheck(retrieveLogs().thenApply(
            resultList -> getIterator(resultList)));
    }
