public ReverseEngineering toReverseEngineering() {
        final ReverseEngineering reverseEngineering = new ReverseEngineering();
        reverseEngineering.setSkipRelationshipsLoading(skipRelationshipsLoading);
        reverseEngineering.setSkipPrimaryKeyLoading(skipPrimaryKeyLoading);
        reverseEngineering.setForceDataMapCatalog(forceDataMapCatalog);
        reverseEngineering.setForceDataMapSchema(forceDataMapSchema);
        reverseEngineering.setDefaultPackage(defaultPackage);
        reverseEngineering.setMeaningfulPkTables(meaningfulPkTables);
        reverseEngineering.setNamingStrategy(namingStrategy);
        reverseEngineering.setStripFromTableNames(stripFromTableNames);
        reverseEngineering.setUsePrimitives(usePrimitives);
        reverseEngineering.setUseJava7Types(useJava7Types);
        reverseEngineering.setTableTypes(tableTypes);

        for(SchemaContainer catalog : catalogs) {
            reverseEngineering.addCatalog(catalog.toCatalog());
        }

        for(FilterContainer schema : schemas) {
            reverseEngineering.addSchema(schema.fillContainer(new Schema()));
        }

        fillContainer(reverseEngineering);

        return reverseEngineering;
    }
