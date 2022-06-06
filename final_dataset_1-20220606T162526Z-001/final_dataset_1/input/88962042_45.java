@PublicAPI(usage = ACCESS)
    public JavaClasses importPackagesOf(Class<?>... classes) {
        return importPackagesOf(ImmutableSet.copyOf(classes));
    }
