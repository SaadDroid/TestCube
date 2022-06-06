public Schema flatten(Schema schema, boolean flattenComplexTypes) {
    Preconditions.checkNotNull(schema);

    // To help make it configurable later
    this.flattenedNameJoiner = FLATTENED_NAME_JOINER;
    this.flattenedSourceJoiner = FLATTENED_SOURCE_JOINER;

    Schema flattenedSchema = flatten(schema, false, flattenComplexTypes);

    LOG.debug("Original Schema : " + schema);
    LOG.debug("Flattened Schema: " + flattenedSchema);

    return flattenedSchema;
  }
