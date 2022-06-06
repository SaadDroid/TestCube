@Override
    public SavedSnapshot build(final SavedSearch<?, ?> search) throws AciErrorException {
        final List<StateTokenAndResultCount> stateTokensList = Arrays.asList(
            getStateTokenAndResultCount(search, false),
            getStateTokenAndResultCount(search, true)
        );

        final Set<TypedStateToken> stateTokens = new HashSet<>();

        for(final StateTokenAndResultCount listToken : stateTokensList) {
            final TypedStateToken token = listToken.getTypedStateToken();
            stateTokens.add(token);
        }

        // use result count from the query without promotions
        final long resultCount = stateTokensList.get(0).getResultCount();

        return new SavedSnapshot.Builder(search)
            .setStateTokens(stateTokens)
            .setResultCount(resultCount)
            .build();
    }
