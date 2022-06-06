public static String constructSelectStatement(String fullTableName, List<ColumnInfo> columnInfos,final String conditions) {
        List<String> columns = Lists.transform(columnInfos, new Function<ColumnInfo, String>(){
            @Override
            public String apply(ColumnInfo input) {
                return input.getColumnName();
            }});
        return constructSelectStatement(fullTableName, columns , conditions, null, false);
    }
