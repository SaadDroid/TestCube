public BashScriptModel build(String bashScript) throws BashScriptModelException {
        BashScriptModel model = new BashScriptModel();

        TokenParser parser = new TokenParser();
        List<ParseToken> tokens;
        try {
            tokens = parser.parse(bashScript);
        } catch (TokenParserException e) {
            throw new BashScriptModelException("Was not able to build bashscript", e);
        }
        buildScriptVariablesByTokens(model,false,true, tokens);
        buildFunctionsByTokens(model, tokens);

        List<ValidationResult> results = new ArrayList<>();
        for (BashScriptValidator<List<ParseToken>> validator : createParseTokenValidators()) {
            results.addAll(validator.validate(tokens));
        }

        for (ValidationResult result : results) {
            if (result instanceof BashError) {
                model.errors.add((BashError) result);
            }
        }

        if (debugMode) {
            appendDebugTokens(model, tokens);
        }

        return model;
    }
