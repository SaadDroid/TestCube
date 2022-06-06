@Override
  public InterpreterResult interpret(String st, InterpreterContext context) {
    String[] lines = splitAndRemoveEmpty(st, "\n");
    return interpret(lines, context);
  }
