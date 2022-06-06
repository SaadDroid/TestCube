public static void commit(Connection sqlConnection) throws SQLException {
    if (sqlConnection == null) {
      return;
    }
    if (!sqlConnection.getAutoCommit()) {
      sqlConnection.commit();
    }
  }
