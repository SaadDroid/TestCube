@Override
  protected void exitRule(ParseTreeListener listener, RuleNode r) {
    ParserRuleContext ctx = (ParserRuleContext) r.getRuleContext();
    try {
      ctx.exitRule(listener);
      listener.exitEveryRule(ctx);
    } catch (WillNotCommitException e) {
      // Re-throw WillNotCommit to get the special parse status
      throw e;
    } catch (Exception e) {
      throw new BatfishParseException(
          String.format("Exception while walking parse tree: %s", e.getMessage()),
          e,
          new ErrorDetails(
              Throwables.getStackTraceAsString(e),
              new ParseExceptionContext(ctx, _parser, _parser.getInput())));
    }
  }
