public Optional<Splitter> getSplitter(final String columnName, final ResultSet resultSet, final int maxSplits)
            throws SQLException
    {
        int type = resultSet.getMetaData().getColumnType(1);
        switch (type) {
            case Types.INTEGER:
                return Optional.of(new IntegerSplitter(new SplitInfo<>(new SplitRange<>(resultSet.getInt(1), resultSet.getInt(2)), columnName, type, maxSplits)));
            default:
               return Optional.empty();
        }
    }
