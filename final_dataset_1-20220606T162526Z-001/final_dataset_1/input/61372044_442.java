public void init() throws IOException {

        if (!moduleProperties.exists()) {
            return;
        }

        resolveNameAndParent();

        contextLocations = Arrays.asList(resolver.getResources(ModuleLocationUtils.getContextLocation(baseDir, name)));
        configLocations = Arrays.asList(resolver.getResources(ModuleLocationUtils.getDefaultsLocation(baseDir, name)));
        inheritableContextLocations = Arrays.asList(resolver.getResources(ModuleLocationUtils.getInheritableContextLocation(baseDir, name)));
        overrideContextLocations = Arrays.asList(resolver.getResources(ModuleLocationUtils.getOverrideContextLocation(baseDir, name)));

        valid = true;
    }
