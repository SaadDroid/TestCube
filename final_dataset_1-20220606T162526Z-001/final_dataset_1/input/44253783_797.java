@Override
  public String translate(JdbcResultRow rs, int column) throws SQLException, IOException {
    return String.valueOf(rs.getFieldValue(column));
  }
