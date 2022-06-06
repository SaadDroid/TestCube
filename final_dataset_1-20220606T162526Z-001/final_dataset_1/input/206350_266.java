public ServerRuntime build() {

        Collection<Module> allModules = new ArrayList<>();

        // first load default or auto-loaded modules...
        allModules.addAll(autoLoadModules ? autoLoadedModules() : defaultModules());

        // custom modules override default and auto-loaded modules...
        allModules.addAll(this.modules);

        // builder modules override default, auto-loaded and custom modules...
        allModules.addAll(builderModules());

        return new ServerRuntime(allModules);
    }
