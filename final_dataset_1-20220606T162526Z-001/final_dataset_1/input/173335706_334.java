public static SQLStatementParser getSqlStatementParser(DbType dbType, String sql) {
        switch (dbType) {
            case MYSQL:
                return new MySqlStatementParser(sql);
            case POSTGRESQL:
                return new PGSQLStatementParser(sql);
            case ORACLE:
                return new OracleStatementParser(sql);
            case SQLSERVER:
                return new SQLServerStatementParser(sql);
            default:
                return null;
        }
    }
