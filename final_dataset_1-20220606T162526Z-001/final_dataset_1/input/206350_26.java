public ClientRuntime build() {
        Collection<Module> allModules = new ArrayList<>();

        // first load default or auto-loaded modules...
        allModules.addAll(autoLoadModules ? autoLoadedModules() : defaultModules());

        // custom modules override default and auto-loaded ...
        allModules.addAll(modules);

        // builder modules override default, auto-loaded and custom modules...
        allModules.addAll(builderModules());

        return new ClientRuntime(allModules);
    }
