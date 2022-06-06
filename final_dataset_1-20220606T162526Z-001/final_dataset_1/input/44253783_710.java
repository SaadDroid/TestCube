@Override
  public void apply(int parameterIndex, PreparedStatement statement, AdaptrisMessage msg) throws SQLException, ServiceException {
    Object queryValue = getQueryValue(msg);
    logger().log(parameterIndex, queryValue);
    statement.setObject(parameterIndex, this.convertToQueryClass(queryValue));
  }
