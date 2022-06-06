public List<ParseToken> parse(String bashScript) throws TokenParserException {
        if (bashScript == null) {
            return new ArrayList<>();
        }
        ParseContext context = new ParseContext();
        context.chars = bashScript.toCharArray();
        try {
            for (; context.hasValidPos(); context.moveForward()) {
                if (isIfHandled(context)) {
                    continue;
                }

                if (isVariableStateHandled(context)) {
                    continue;
                }

                if (isCommentStateHandled(context)) {
                    continue;
                }
                if (isStringStateHandled(context)) {
                    continue;
                }
                if (isHereStringStateHandled(context)) {
                    continue;
                }
                if (isHereDocStateHandled(context)) {
                    continue;
                }

                handleNotVariableNorCommentOrString(context);
            }
            // add last token if existing
            context.addTokenAndResetText();
        } catch (RuntimeException e) {
            throw new TokenParserException("Was not able to parse script because of runtime error", e);
        }

        return context.tokens;
    }
