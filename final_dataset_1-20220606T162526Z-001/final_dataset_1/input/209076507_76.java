public static <T extends FullSchemaInfo> FullSchemaInfo cast(T schemaInfo) {
        return builder(schemaInfo).build();
    }
