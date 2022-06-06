public Promise<List<ResourceResponse>, ResourceException> createPolicies(Context context,
            Set<JsonValue> policies) {

        final List<String> policyIds = new ArrayList<String>();
        List<Promise<ResourceResponse, ResourceException>> promises = new ArrayList<>();
        for (JsonValue policy : policies) {
            promises.add(policyResource.handleCreate(context, Requests.newCreateRequest("", policy))
                    .thenOnResult(new ResultHandler<ResourceResponse>() {
                        @Override
                        public void handleResult(ResourceResponse result) {
                            //Save ids of created policies, in case a latter policy fails to be created,
                            // so we can roll back.
                            policyIds.add(result.getId());
                        }
                    }));
        }
        return Promises.when(promises)
                .thenAsync(new AsyncFunction<List<ResourceResponse>, List<ResourceResponse>, ResourceException>() {
                    @Override
                    public Promise<List<ResourceResponse>, ResourceException> apply(List<ResourceResponse> value) {
                        return newResultPromise(value);
                    }
                }, new UmaPolicyCreateFailureHandler(context, policyIds));
    }
