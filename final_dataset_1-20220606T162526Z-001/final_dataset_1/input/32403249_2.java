public List<ArtifactSpec> getDependencies() {
        if (this.module == null) {
            return Collections.emptyList();
        }

        List<ArtifactType<ResourcesType<ModuleDescriptor>>> artifacts = this.module.getOrCreateResources().getAllArtifact();

        List<ArtifactSpec> dependencies = new ArrayList<>();

        for (ArtifactType<ResourcesType<ModuleDescriptor>> artifact : artifacts) {
            ArtifactSpec dep = ArtifactSpec.fromMscGav(artifact.getName());
            dep.shouldGather = true;
            dependencies.add(dep);
        }

        return dependencies;
    }
