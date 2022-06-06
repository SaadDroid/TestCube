@Override
    public Promise<ResourceResponse, ResourceException> createInstance(Context context, CreateRequest request) {
        return umaPolicyService.createPolicy(context, request.getContent())
                .thenAsync(new AsyncFunction<UmaPolicy, ResourceResponse, ResourceException>() {
                    @Override
                    public Promise<ResourceResponse, ResourceException> apply(UmaPolicy result) {
                        return newResultPromise(newResourceResponse(result.getId(), result.getRevision(), json(object())));
                    }
                });
    }
