Set<String> query(QueryRequest request, Subject subject, String realm) throws EntitlementException {

        QueryFilter<JsonPointer> queryFilter = request.getQueryFilter();
        if (queryFilter == null) {
            // Return everything
            queryFilter = QueryFilter.alwaysTrue();
        }

        try {
            Set<SearchFilter> searchFilters = queryFilter.accept(
                    new ApplicationQueryBuilder(queryAttributes),
                    new HashSet<SearchFilter>());
            return appManager.search(subject, realm, searchFilters);

        } catch (UnsupportedOperationException ex) {
            throw new EntitlementException(EntitlementException.INVALID_SEARCH_FILTER, new Object[]{ ex.getMessage() });
        } catch (IllegalArgumentException ex) {
            throw new EntitlementException(EntitlementException.INVALID_VALUE, new Object[] { ex.getMessage() });
        }
    }
