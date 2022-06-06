public void addSpec(Spec spec, String tagValue) throws IOException {
    try (Connection connection = this.dataSource.getConnection();
        PreparedStatement statement = connection.prepareStatement(String.format(INSERT_STATEMENT, this.tableName))) {
      setAddPreparedStatement(statement, spec, tagValue);
      statement.executeUpdate();
      connection.commit();
    } catch (SQLException | SpecSerDeException e) {
      throw new IOException(e);
    }
  }
