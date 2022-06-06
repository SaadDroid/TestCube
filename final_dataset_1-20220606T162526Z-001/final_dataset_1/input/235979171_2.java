public Try<List<SchemaList.SubjectEntry>> parseYaml(FileInputStream input) {
        return Try
                .ofFailable(() -> (SchemaList) getYaml().load(input))
                .onFailure((t) -> logger.error("Fail to parse the yaml file, it may be corrupted", t))
                .map(SchemaList::getSchemas);
    }
