public Long getAverageDuration(TokenType tokenType) throws CoreTokenException {
        long result = 0l;

        if (tokenType == null) {
            throw new NullPointerException("TokenType cannot be null.");
        }

        final Collection<Long> queryResults = delegate.listDurationOfTokens(tokenType);

        if (queryResults.size() > 0) {

            for (Long entry : queryResults) {
                result += entry;
            }

            result /= queryResults.size();
        }

        return result;
    }
