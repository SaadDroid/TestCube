@Override
    public List<Privilege> query(QueryRequest request) throws EntitlementException {
        QueryFilter<JsonPointer> queryFilter = request.getQueryFilter();
        if (queryFilter == null) {
            // Return everything
            queryFilter = QueryFilter.alwaysTrue();
        }

        try {
            Set<SearchFilter> searchFilters = queryFilter.accept(new PrivilegeQueryBuilder(queryAttributes),
                                                                 new HashSet<SearchFilter>());

            return privilegeManager.search(searchFilters);
        } catch (UnsupportedOperationException ex) {
            throw new EntitlementException(EntitlementException.INVALID_SEARCH_FILTER,
                    new Object[] { ex.getMessage() });
        } catch (IllegalArgumentException ex) {
            throw new EntitlementException(EntitlementException.INVALID_VALUE,
                    new Object[] { ex.getMessage() });
        }
    }
