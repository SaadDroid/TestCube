static TableMetadata getTableMetadata() {
    List<ColumnMetadata> columnMetadata =
        ImmutableList.of(
            new ColumnMetadata(COL_NODE, Schema.NODE, "The node where action takes place"),
            new ColumnMetadata(COL_VRF, Schema.STRING, "The VRF where action takes place"),
            new ColumnMetadata(
                COL_PEER, Schema.NODE, "The node's neighbor to which the action applies"),
            new ColumnMetadata(COL_ACTION, Schema.STRING, "The action that takes place"),
            new ColumnMetadata(COL_PREFIX, Schema.PREFIX, "The prefix in question"));

    return new TableMetadata(columnMetadata, TEXT_DESC);
  }
