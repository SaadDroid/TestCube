@Override
  public Object applyInputParam(AdaptrisMessage msg) throws JdbcParameterException {
    this.checkConstant();
    return this.getConstant();
  }
