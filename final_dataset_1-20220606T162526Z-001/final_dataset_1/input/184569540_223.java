@Override
    public void create(PlatformMode platformMode, KubernetesListBuilder builder) {
        if (!hasImageConfiguration()) {
            log.verbose("No images resolved. Skipping ...");
            return;
        }

        // Ensure that all contoller have template specs
        ensureTemplateSpecs(builder);

        // Update containers in template specs
        updateContainers(builder);
    }
