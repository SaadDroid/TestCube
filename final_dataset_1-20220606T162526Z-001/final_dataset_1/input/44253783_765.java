@Override
  public String translate(JdbcResultRow rs, int column) throws SQLException, IOException {
    Object doubleObject = rs.getFieldValue(column);
    if(doubleObject instanceof Double)
      return toString((Double) rs.getFieldValue(column));
    else
      return toString(new Double(rs.getFieldValue(column).toString()));
  }
