public static ParboiledLocationSpecifier parse(String input) {

    ParsingResult<AstNode> result =
        new ReportingParseRunner<AstNode>(
                Parser.instance().getInputRule(Grammar.LOCATION_SPECIFIER))
            .run(input);

    if (!result.parseErrors.isEmpty()) {
      throw new IllegalArgumentException(
          ParserUtils.getErrorString(
              input,
              Grammar.LOCATION_SPECIFIER,
              (InvalidInputError) result.parseErrors.get(0),
              Parser.ANCHORS));
    }

    AstNode ast = ParserUtils.getAst(result);
    checkArgument(
        ast instanceof LocationAstNode,
        "ParboiledLocationSpecifier requires a LocationSpecifier input");

    return new ParboiledLocationSpecifier((LocationAstNode) ast);
  }
