@Override
  public void applyStatementParameters(AdaptrisMessage message, PreparedStatement statement,
                                       StatementParameterCollection parameters, String originalSql) throws ServiceException {
    Matcher m = Pattern.compile(this.getParameterNameRegex()).matcher(originalSql);

    int counter = 0;
    while (m.find()) {
      counter++;

      String parameterName = m.group();
      JdbcStatementParameter statementParameter =
          parameters.getParameterByName(parameterName.substring(this.getParameterNamePrefix()
          .length()));
      try {
        Args.notNull(statementParameter, "statementParameter");
        statementParameter.apply(counter, statement, message);
      }
      catch (Exception ex) {
        throw ExceptionHelper.wrapServiceException(ex);
      }
    }
  }
