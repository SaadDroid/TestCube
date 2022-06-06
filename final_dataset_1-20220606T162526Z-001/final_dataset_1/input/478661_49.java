public Token nextToken() throws TokenStreamException {
        if (deferred != null) {
            final Token t = deferred;
            deferred = null;
            return t;
        }

        final Token token = (input == this) ? super.nextToken() : input.nextToken();

        // workaround to get "prompt" and "rem" clauses (SQLPLUS tool) processed correctly
        if (token == null) {
            return null;
        }

        final int tokenType = token.getType();
        if (prompt) {
            if (tokenType == PLSqlTokenTypes.LF || tokenType == PLSqlTokenTypes.EOF) {
                deferred = token;
                prompt = false;
                return new CommonToken(PLSqlTokenTypes.CUSTOM_TOKEN, "");
            }
        } else {
            // TODO -- make me more generic
            switch (tokenType) {
                case PLSqlTokenTypes.LITERAL_prompt:
                case PLSqlTokenTypes.LITERAL_rem:
                case PLSqlTokenTypes.LITERAL_spool:
                case PLSqlTokenTypes.LITERAL_host:
                case PLSqlTokenTypes.AT_PREFIXED:
                    prompt = true;
                    break;
            }
        }

        return token;
    }
