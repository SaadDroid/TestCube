@Override
  public InterpreterResult interpret(String sql, InterpreterContext contextInterpreter) {
    logger.info("Run SQL command '{}'", sql);
    return executeSql(sql);
  }
