public ResultSet invoke(Connection conn, Statement statement) throws SQLException {
    switch (type) {
    case SQL:
      boolean ret = Objects.requireNonNull(statement).execute(sql);
      ResultSet results = statement.getResultSet();

      // Either execute(sql) returned true or the resultSet was null
      assert ret || null == results;

      return results;
    case METADATA:
      DatabaseMetaData metadata = Objects.requireNonNull(conn).getMetaData();
      switch (metaDataOperation) {
      case GET_ATTRIBUTES:
        verifyOpArgs(4);
        return metadata.getAttributes((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (String) operationArgs[3]);
      case GET_BEST_ROW_IDENTIFIER:
        verifyOpArgs(5);
        return metadata.getBestRowIdentifier((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (int) operationArgs[3],
            (boolean) operationArgs[4]);
      case GET_CATALOGS:
        verifyOpArgs(0);
        return metadata.getCatalogs();
      case GET_COLUMNS:
        verifyOpArgs(4);
        return metadata.getColumns((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (String) operationArgs[3]);
      case GET_COLUMN_PRIVILEGES:
        verifyOpArgs(4);
        return metadata.getColumnPrivileges((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (String) operationArgs[3]);
      case GET_CROSS_REFERENCE:
        verifyOpArgs(6);
        return metadata.getCrossReference((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (String) operationArgs[3],
            (String) operationArgs[4],
            (String) operationArgs[5]);
      case GET_EXPORTED_KEYS:
        verifyOpArgs(3);
        return metadata.getExportedKeys((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      case GET_FUNCTIONS:
        verifyOpArgs(3);
        return metadata.getFunctions((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      case GET_FUNCTION_COLUMNS:
        verifyOpArgs(4);
        return metadata.getFunctionColumns((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (String) operationArgs[3]);
      case GET_IMPORTED_KEYS:
        verifyOpArgs(3);
        return metadata.getImportedKeys((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      case GET_INDEX_INFO:
        verifyOpArgs(5);
        return metadata.getIndexInfo((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (boolean) operationArgs[3],
            (boolean) operationArgs[4]);
      case GET_PRIMARY_KEYS:
        verifyOpArgs(3);
        return metadata.getPrimaryKeys((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      case GET_PROCEDURES:
        verifyOpArgs(3);
        return metadata.getProcedures((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      case GET_PROCEDURE_COLUMNS:
        verifyOpArgs(4);
        return metadata.getProcedureColumns((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (String) operationArgs[3]);
      case GET_PSEUDO_COLUMNS:
        verifyOpArgs(4);
        return metadata.getPseudoColumns((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (String) operationArgs[3]);
      case GET_SCHEMAS:
        verifyOpArgs(0);
        return metadata.getSchemas();
      case GET_SCHEMAS_WITH_ARGS:
        verifyOpArgs(2);
        return metadata.getSchemas((String) operationArgs[0],
            (String) operationArgs[1]);
      case GET_SUPER_TABLES:
        verifyOpArgs(3);
        return metadata.getSuperTables((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      case GET_SUPER_TYPES:
        verifyOpArgs(3);
        return metadata.getSuperTypes((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      case GET_TABLES:
        verifyOpArgs(4);
        return metadata.getTables((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (String[]) operationArgs[3]);
      case GET_TABLE_PRIVILEGES:
        verifyOpArgs(3);
        return metadata.getTablePrivileges((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      case GET_TABLE_TYPES:
        verifyOpArgs(0);
        return metadata.getTableTypes();
      case GET_TYPE_INFO:
        verifyOpArgs(0);
        return metadata.getTypeInfo();
      case GET_UDTS:
        verifyOpArgs(4);
        return metadata.getUDTs((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2],
            (int[]) operationArgs[3]);
      case GET_VERSION_COLUMNS:
        verifyOpArgs(3);
        return metadata.getVersionColumns((String) operationArgs[0],
            (String) operationArgs[1],
            (String) operationArgs[2]);
      default:
        throw new IllegalArgumentException("Unhandled Metadata operation: " + metaDataOperation);
      }
    default:
      throw new IllegalArgumentException("Unable to process QueryState of type " + type);
    }
  }
