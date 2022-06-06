@Override
    public CompletableFuture<GetStreamResponse> getStream(GetStreamRequest request) {
        return rootRange.getStream(request);
    }
