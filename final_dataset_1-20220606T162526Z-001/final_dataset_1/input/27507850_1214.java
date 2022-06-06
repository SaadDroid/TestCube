@JsonCreator
  // visible for testing.
  static ColumnMetadata jsonCreator(
      @Nullable @JsonProperty(PROP_NAME) String name,
      @Nullable @JsonProperty(PROP_SCHEMA) Schema schema,
      @Nullable @JsonProperty(PROP_DESCRIPTION) String description,
      @Nullable @JsonProperty(PROP_IS_KEY) Boolean isKey,
      @Nullable @JsonProperty(PROP_IS_VALUE) Boolean isValue) {
    checkArgument(name != null, "'name' cannot be null for ColumnMetadata");
    checkArgument(description != null, "'description' cannot be null for ColumnMetadata");
    checkArgument(schema != null, "'schema' cannot be null for ColumnMetadata");
    return new ColumnMetadata(name, schema, description, isKey, isValue);
  }
