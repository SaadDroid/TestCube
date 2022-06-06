@Override
    public ItemSearchResult<ApplicationItem> search(final int page, final int resultsByPage, final String search, final String orders,
            final Map<String, String> filters) {
        return creator.create(getEngineSession()).search(page, resultsByPage, search, orders, filters);
    }
