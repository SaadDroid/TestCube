@Override
  public String translate(JdbcResultRow rs, int column) throws SQLException, IOException {
    return toString(rs.getFieldValue(column));
  }
