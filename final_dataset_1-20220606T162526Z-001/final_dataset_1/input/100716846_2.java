@Override
    public CompletionId invokeFunction(FlowId flowId, String functionId, byte[] data, HttpMethod method, Headers headers, CodeLocation codeLocation) {

        APIModel.HTTPReq httpReq = new APIModel.HTTPReq();

        if (headers != null) {
            if (data.length > 0) {
                BlobResponse blobResponse = blobStoreClient.writeBlob(flowId.getId(), data, headers.get(CONTENT_TYPE_HEADER).orElse(CONTENT_TYPE_OCTET_STREAM));
                httpReq.body = APIModel.Blob.fromBlobResponse(blobResponse);
            }

            httpReq.headers = new ArrayList<>();

            headers.asMap().forEach((k, vs) -> vs.forEach(v -> httpReq.headers.add(APIModel.HTTPHeader.create(k, v))));

            Map<String, List<String>> headersMap = headers.asMap();
            headersMap.forEach((key, values) -> values.forEach(value -> httpReq.headers.add(APIModel.HTTPHeader.create(key, value))));
        }

        httpReq.method = APIModel.HTTPMethod.fromFlow(method);

        APIModel.AddInvokeFunctionStageRequest addInvokeFunctionStageRequest = new APIModel.AddInvokeFunctionStageRequest();
        addInvokeFunctionStageRequest.arg = httpReq;
        addInvokeFunctionStageRequest.codeLocation = codeLocation.getLocation();
        addInvokeFunctionStageRequest.callerId = FlowRuntimeGlobals.getCurrentCompletionId().map(CompletionId::getId).orElse(null);
        addInvokeFunctionStageRequest.functionId = functionId;

        try {
            return executeAddInvokeFunctionStageRequest(flowId, addInvokeFunctionStageRequest);
        } catch (IOException e) {
            throw new PlatformCommunicationException("Failed to create invokeFunction stage", e);
        }
    }
