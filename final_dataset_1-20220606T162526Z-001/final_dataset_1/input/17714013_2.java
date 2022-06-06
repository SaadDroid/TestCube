@Override
    public TransferRuleDescriptor convert(IDataSet source) {
        Collection<RecodeRule> result = new ArrayList<>();
        try {
            for (String tableName : source.getTableNames()) {
                ITable table = source.getTable(tableName);
                int columnCount = table.getTableMetaData().getColumns().length;
                if (columnCount >= MIN_COLUMN_COUNT) {
                    DictionaryNamedPath from = new DictionaryNamedPath(null, tableName);
                    DictionaryNamedPath to = new DictionaryNamedPath(null, tableName);
                    result.addAll(createRecodeRules(from, to, table));
                } else {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Recode table with name '%s' does not have enough columns to create recode rules. Expected: %d, got: %d", tableName, MIN_COLUMN_COUNT, columnCount
                            )
                    );
                }
            }
        } catch (DataSetException ex) {
            ReflectionUtil.rethrowRuntimeException(ex);
        }
        return new TransferRuleDescriptor(result);
    }
