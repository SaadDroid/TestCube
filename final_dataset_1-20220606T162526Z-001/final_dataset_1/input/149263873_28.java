@Nonnull
    public static EntityDataStore<Object> getDataStore() {

        SchemaModifier schemaModifier = new SchemaModifier(configuration);
        schemaModifier.createTables(TableCreationMode.CREATE_NOT_EXISTS);

        return new EntityDataStore<>(configuration);
    }
