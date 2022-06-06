@Override
    public ItemSearchResult<ApplicationPageItem> search(final int page, final int resultsByPage, final String search, final String orders,
            final Map<String, String> filters) {
        final SearchOptionsCreator creator = makeSearchOptionCreator(page, resultsByPage, search, orders, filters);
        try {
            final SearchResult<ApplicationPage> searchResult = runSearch(creator);
            final List<ApplicationPageItem> appPageItems = convertEngineToConsoleItemsList(searchResult.getResult());
            return new ItemSearchResult<ApplicationPageItem>(page, resultsByPage, searchResult.getCount(),
                    appPageItems);
        } catch (final SearchException e) {
            throw new APIException(e);
        }
    }
