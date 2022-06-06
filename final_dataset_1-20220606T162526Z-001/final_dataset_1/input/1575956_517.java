@Override
    public void range(RangeRequest request,
                      StreamObserver<RangeResponse> responseObserver) {
        rangeStore.range(request).whenComplete(
            new ResponseHandler<RangeResponse>(responseObserver) {
                @Override
                protected RangeResponse createErrorResp(Throwable cause) {
                    return RangeResponse.newBuilder()
                        .setHeader(ResponseHeader.newBuilder()
                            .setCode(StatusCode.INTERNAL_SERVER_ERROR)
                            .setRoutingHeader(request.getHeader())
                            .build())
                        .build();
                }
            });
    }
