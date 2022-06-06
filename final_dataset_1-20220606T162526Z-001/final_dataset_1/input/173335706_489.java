public static boolean retryCallSilent(final Callable<Boolean> callable, boolean checkResult) {
        boolean result = false;
        try {
            result = getDefaultRetryer(checkResult).call(callable);
        } catch (ExecutionException | RetryException e) {
            logger.warn("Retry call {} failed {}", callable, e.getMessage(), e);
        }
        return result;
    }
