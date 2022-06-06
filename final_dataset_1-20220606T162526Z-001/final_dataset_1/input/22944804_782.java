public Collection<PartialToken> attributeQuery(final TokenFilter filter)
            throws CoreTokenException, IllegalArgumentException {

        ResultHandler<Collection<PartialToken>, CoreTokenException> handler = handlerFactory.getPartialQueryHandler();
        try {
            attributeQueryWithHandler(filter, handler);
            Collection<PartialToken> partialTokens = handler.getResults();
            Collection<PartialToken> results = new ArrayList<PartialToken>();
            if (filter.getReturnFields().contains(CoreTokenField.BLOB)) {
                for (PartialToken p : partialTokens) {
                    try {
                        byte[] value = p.getValue(CoreTokenField.BLOB);
                        results.add(new PartialToken(p, CoreTokenField.BLOB, strategy.reverse(value)));
                    } catch (TokenStrategyFailedException e) {
                        throw new CoreTokenException("Failed to reverse Blob strategy", e);
                    }
                }
            } else {
                results = partialTokens;
            }
            debug("AttributeQuery: returned {0} Partial Tokens: {1}", results.size(), filter);
            return results;
        } catch (CoreTokenException e) {
            throw new QueryFailedException(filter, e);
        }
    }
