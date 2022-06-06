@Override
    public Privilege update(String existingName, Privilege policy) throws EntitlementException {
        privilegeManager.modify(existingName, policy);
        return policy;
    }
