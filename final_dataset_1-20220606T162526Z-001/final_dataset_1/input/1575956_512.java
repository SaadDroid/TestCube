@Override
    public void getStream(GetStreamRequest request,
                          StreamObserver<GetStreamResponse> responseObserver) {
        rs.getStream(request).whenComplete(
            new ResponseHandler<GetStreamResponse>(responseObserver) {
                @Override
                protected GetStreamResponse createErrorResp(Throwable cause) {
                    return GetStreamResponse.newBuilder()
                        .setCode(StatusCode.INTERNAL_SERVER_ERROR)
                        .build();
                }
            });
    }
