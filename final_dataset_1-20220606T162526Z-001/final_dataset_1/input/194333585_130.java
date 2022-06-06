public static String getSqlQueryBadCoveredColVal(Connection conn,
            SourceTargetColumnNames columnNames, long scrutinyTimeMillis) throws SQLException {
        String paramQuery = getHasTargetRowQuery(conn, columnNames, scrutinyTimeMillis);
        return paramQuery.replaceFirst("\\?", "true");
    }
