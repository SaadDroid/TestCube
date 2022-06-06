protected GroovyClassLoader buildPageClassloader(final APISession apiSession, final String pageName,
            final File pageDirectory)
            throws CompilationFailedException, IOException {
        GroovyClassLoader pageClassLoader = PAGES_CLASSLOADERS.get(pageName);
        final BDMClientDependenciesResolver bdmDependenciesResolver = new BDMClientDependenciesResolver(apiSession);
        if (pageClassLoader == null
                || getConsoleProperties(apiSession).isPageInDebugMode()
                || isOutdated(pageClassLoader, bdmDependenciesResolver)) {
            synchronized (CustomPageService.class) {//Handle multiple queries to create several classloaders at the same time
                pageClassLoader = new GroovyClassLoader(getParentClassloader(pageName,
                        new CustomPageDependenciesResolver(pageName, pageDirectory, getWebBonitaConstantsUtils(apiSession)),
                        bdmDependenciesResolver));
                pageClassLoader.addClasspath(pageDirectory.getPath());
                PAGES_CLASSLOADERS.put(pageName, pageClassLoader);
            }
        }
        return pageClassLoader;
    }
