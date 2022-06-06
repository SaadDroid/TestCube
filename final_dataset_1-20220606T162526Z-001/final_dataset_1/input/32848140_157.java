@Override
  public InterpreterResult interpret(String st, InterpreterContext context)
      throws InterpreterException {

    if (isSparkVersionUnsupported()) {
      return unsupportedMessage;
    }

    z.setInterpreterContext(context);
    z.setGui(context.getGui());
    z.setNoteGui(context.getNoteGui());
    InterpreterContext.set(context);

    jsc.setJobGroup(buildJobGroupId(context), buildJobDesc(context), false);
    jsc.setLocalProperty("spark.scheduler.pool", context.getLocalProperties().get("pool"));

    InterpreterOutput out = context.out;
    PrintStream scalaOut = Console.out();
    PrintStream newOut = (out != null) ? new PrintStream(out) : null;

    Console.setOut(newOut);
    InterpreterResult result = interpreter.interpret(st, context);
    Console.setOut(scalaOut);

    return result;
  }
