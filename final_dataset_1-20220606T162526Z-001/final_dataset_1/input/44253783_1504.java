public synchronized Connection getConnection() throws SQLException {
    validateConnection();
    return sqlConnection;
  }
