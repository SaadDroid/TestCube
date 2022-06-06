@Override
    public ResourceMatchUsing verifyResources(final Set<String> resources) {
        return new ResourceMatchUsing() {

            @Override
            public AgainstResourceType using(final ResourceName resourceHandler) {
                return new AgainstResourceType() {

                    @Override
                    public ConstraintResult against(ResourceType resourceType) {
                        return verifyResources(resources, resourceHandler, resourceType);
                    }

                };
            }

        };
    }
