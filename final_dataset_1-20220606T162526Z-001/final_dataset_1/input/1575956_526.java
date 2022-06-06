@Override
    public CompletableFuture<RangeResponse> range(RangeRequest rangeReq) {
        if (log.isTraceEnabled()) {
            log.trace("Received range request {}", rangeReq);
        }
        return doRange(rangeReq)
            .thenApply(result -> {
                try {
                    RangeResponse rangeResp = processRangeResult(
                        rangeReq.getHeader(),
                        result);
                    return rangeResp;
                } finally {
                    result.close();
                }
            })
            .exceptionally(cause -> {
                log.error("Failed to process range request {}", rangeReq, cause);
                return RangeResponse.newBuilder()
                    .setHeader(ResponseHeader.newBuilder()
                        .setCode(handleCause(cause))
                        .setRoutingHeader(rangeReq.getHeader())
                        .build())
                    .build();
            });
    }
