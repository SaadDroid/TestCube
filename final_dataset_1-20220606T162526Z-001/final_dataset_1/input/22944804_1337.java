@Override
    public AgainstResourceType verifyActions(final Set<String> actions) {
        return new AgainstResourceType() {

            @Override
            public ConstraintResult against(ResourceType resourceType) {
                return verifyActions(actions, resourceType);
            }

        };
    }
