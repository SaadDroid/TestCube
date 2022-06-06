public Promise<List<ResourceResponse>, ResourceException> updatePolicies(Context context,
            Set<JsonValue> policies) {
        List<Promise<ResourceResponse, ResourceException>> promises = new ArrayList<>();
        for (JsonValue policy : policies) {
            String policyName = policy.get("name").asString();
            promises.add(policyResource.handleUpdate(context, Requests.newUpdateRequest(policyName, policy)));
        }
        return Promises.when(promises);
    }
