public static String getWriterPluginName(DbType dbType) {
        switch (dbType) {
            case MYSQL:
                return DATAX_WRITER_PLUGIN_MYSQL;
            case POSTGRESQL:
                return DATAX_WRITER_PLUGIN_POSTGRESQL;
            case ORACLE:
                return DATAX_WRITER_PLUGIN_ORACLE;
            case SQLSERVER:
                return DATAX_WRITER_PLUGIN_SQLSERVER;
            default:
                return null;
        }
    }
