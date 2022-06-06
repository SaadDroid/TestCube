public static LiteSchemaInfo toLiteSchemaInfo(SchemaDocument source) {
        if (source == null) {
            return null;
        }

        return LiteSchemaInfo.builder()
                .subject(source.getSubject())
                .version(source.getVersion())
                .schemaRegistryId(source.getSchemaRegistryId())
                .name(source.getRootName())
                .namespace(source.getRootNamespace())
                .fullName(source.getRootFullname())
                .compatibility(source.getCompatibility())
                .mode(source.getMode())
                .versionLatest(source.getVersionLatest())
                .deleted(source.getDeleted())
                .build();
    }
