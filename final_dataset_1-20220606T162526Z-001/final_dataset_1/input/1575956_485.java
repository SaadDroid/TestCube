@Override
    public CompletableFuture<GetStreamResponse> getStream(GetStreamRequest request) {
        if (IdCase.STREAM_ID == request.getIdCase()) {
            return streamPropertiesToResponse(
                getStreamProps(request.getStreamId()));
        } else if (IdCase.STREAM_NAME == request.getIdCase()) {
            return getStreamProps(request.getStreamName());
        } else {
            return FutureUtils.value(GetStreamResponse.newBuilder()
                .setCode(StatusCode.ILLEGAL_OP)
                .build());
        }
    }
