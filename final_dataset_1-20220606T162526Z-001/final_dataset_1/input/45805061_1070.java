@Override
  public UserExpression parse(final String expression) {
    try {
      final ExprParser parser = new ExprParser(new CommonTokenStream(new ExprLexer(new ANTLRReaderStream(new StringReader(expression))))) {
        @Override
        public void reportError(final RecognitionException e) {
          throw new OpenGammaRuntimeException(e.getMessage());
        }
      };
      final ExprParser.root_return root = parser.root();
      return build(((Tree) root.getTree()).getChild(0));
    } catch (Throwable e) {
      s_logger.warn("Couldn't parse expression {} - {}", expression, e);
      throw new IllegalArgumentException(expression);
    }
  }
