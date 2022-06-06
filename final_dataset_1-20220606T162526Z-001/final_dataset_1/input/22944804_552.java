public static UmaPolicy valueOf(ResourceSetDescription resourceSet, JsonValue policy) throws BadRequestException {
        validateUmaPolicy(policy);
        return new UmaPolicy(resourceSet, policy, null);
    }
