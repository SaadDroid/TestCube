public static Collection<File> getConfiguredDependencies(Configuration configuration) {
        if(repositorySystem == null) {
            repositorySystem = new MavenRepositorySystem();
        }
        
        List<File> artifactsToPreload = new LinkedList<File>();
        
        addDefaultGlobalExclusions();
        
        List<Object> excludePatterns = configuration.getList(PRELOAD_EXCLUDES, 
                Collections.EMPTY_LIST);
        for (Object excludePattern : excludePatterns) {
            String excludePatternString = excludePattern.toString();
            if(excludePattern != null && !excludePatternString.isEmpty()) {
                logger.info("Excluding {} from dependency resolution.", excludePattern);
                repositorySystem.addGlobalExclusion(excludePatternString);
            }
        }
        
        processMavenRepositories(configuration, repositorySystem);
        
        List<Object> artifacts = configuration.getList(PRELOAD_ARTIFACTS, 
                Collections.EMPTY_LIST);
        for (Object artifactSpecification : artifacts) {
            logger.info("Resolving artifact {}.", artifactSpecification);
            try {
                List<File> dependencies = repositorySystem.
                        resolveDependencies(artifactSpecification.toString());
                addToListIfUnique(dependencies, artifactsToPreload);
                logger.debug("{} resolved to {}.", artifactSpecification, dependencies);
            } catch (DependencyResolutionException ex) {
                logger.warn("Could not resolve artifact {}.", artifactSpecification, ex);
            }
        }
        
        List<Object> poms = configuration.getList(PRELOAD_POMS, 
                Collections.EMPTY_LIST);
        for (Object pomPath : poms) {
            logger.info("Resolving artifacts from POM file: {}.", pomPath);
            try {
                List<File> dependencies = repositorySystem.
                        resolveDependenciesFromPom(new File(pomPath.toString()));
                addToListIfUnique(dependencies, artifactsToPreload);
                logger.debug("{} resolved to {}.", pomPath, dependencies);
            } catch (DependencyResolutionException ex) {
                logger.warn("Could not resolve artifacts from {}.", pomPath, ex);
            }
        }
        
        repositorySystem = null;
        
        return artifactsToPreload;
    }
