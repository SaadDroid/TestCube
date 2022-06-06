@Override
    public Promise<ResourceResponse, ResourceException> readInstance(Context context, final String resourceId,
            ReadRequest request) {
        return umaPolicyService.readPolicy(context, resourceId)
                .thenAsync(new AsyncFunction<UmaPolicy, ResourceResponse, ResourceException>() {
                    @Override
                    public Promise<ResourceResponse, ResourceException> apply(UmaPolicy result) {
                        return newResultPromise(newResourceResponse(result.getId(), result.getRevision(), result.asJson()));
                    }
                });
    }
