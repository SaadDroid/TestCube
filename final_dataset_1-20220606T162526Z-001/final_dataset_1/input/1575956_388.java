public static <T> RangeRequestProcessor<T> of(
        RangeRequest request,
        Function<RangeResponse, T> responseFunc,
        StorageContainerChannel channel,
        ScheduledExecutorService executor,
        Policy backoffPolicy) {
        return new RangeRequestProcessor<>(request, responseFunc, channel, executor, backoffPolicy);
    }
