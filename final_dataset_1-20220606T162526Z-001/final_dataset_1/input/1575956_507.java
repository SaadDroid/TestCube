@Override
    public void getNamespace(GetNamespaceRequest request,
                             StreamObserver<GetNamespaceResponse> responseObserver) {
        rs.getNamespace(request).whenComplete(
            new ResponseHandler<GetNamespaceResponse>(responseObserver) {
                @Override
                protected GetNamespaceResponse createErrorResp(Throwable cause) {
                    return GetNamespaceResponse.newBuilder()
                        .setCode(StatusCode.INTERNAL_SERVER_ERROR)
                        .build();
                }
            });
    }
