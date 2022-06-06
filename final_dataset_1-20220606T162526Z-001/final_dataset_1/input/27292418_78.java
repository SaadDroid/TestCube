public DefinitionGraph transform(Map<String, List<ModuleContext>> moduleMap) {
        definition(null, RootDefinition.builder(),
            builder -> moduleMap.keySet().forEach(
                moduleName -> builder.withModule(transformModules(moduleName, moduleMap.get(moduleName)))));
        return createGraph(definitions).build();
    }
