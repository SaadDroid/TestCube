InputValidationNotes run() {

    ParsingResult<AstNode> result;
    try {
      result = new ReportingParseRunner<AstNode>(_inputRule).run(_query);
    } catch (ParserRuntimeException e) {
      if (e.getCause() instanceof IllegalArgumentException) {
        return new InputValidationNotes(
            Validity.INVALID, getErrorMessage((IllegalArgumentException) e.getCause()), -1);
      } else {
        return new InputValidationNotes(Validity.INVALID, e.getMessage(), -1);
      }
    }

    if (!result.parseErrors.isEmpty()) {
      InvalidInputError error = (InvalidInputError) result.parseErrors.get(0);
      return new InputValidationNotes(
          Validity.INVALID,
          getErrorMessage(_grammar.getFriendlyName(), error.getStartIndex()),
          error.getStartIndex());
    }

    AstNode resultAst = ParserUtils.getAst(result);
    List<String> noMatchMessages = noMatchMessages(resultAst);
    if (!noMatchMessages.isEmpty()) {
      return new InputValidationNotes(Validity.NO_MATCH, noMatchMessages.get(0));
    }

    Set<String> expansions = expand(resultAst);
    return new InputValidationNotes(Validity.VALID, ImmutableList.copyOf(expansions));
  }
