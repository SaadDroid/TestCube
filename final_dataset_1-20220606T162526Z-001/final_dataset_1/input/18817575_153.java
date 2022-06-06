@Activate
    protected void activate(BundleContext context) {
        this.tracker = new ServiceTracker<>(context, ResourceModelFactory.class.getName(), new ServiceTrackerCustomizer<ResourceModelFactory, ResourceModelFactory>() {
            @Override
            public ResourceModelFactory addingService(ServiceReference<ResourceModelFactory> reference) {
                final ResourceModelFactory factory = context.getService(reference);
                registerModels(reference.getBundle(), factory);
                return context.getService(reference);
            }

            @Override
            public void modifiedService(ServiceReference<ResourceModelFactory> reference, ResourceModelFactory service) {
                final ResourceModelFactory factory = context.getService(reference);
                unregister(reference.getBundle());
                registerModels(reference.getBundle(), factory);
            }

            @Override
            public void removedService(ServiceReference reference, ResourceModelFactory service) {
                unregister(reference.getBundle());
            }
        });
        this.tracker.open(true);
    }
