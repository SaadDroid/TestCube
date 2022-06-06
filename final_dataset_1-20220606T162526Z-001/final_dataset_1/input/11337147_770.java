public void checkSearchFilters(Map<String, String> filters) {
        if (filters == null || !filters.containsKey(CaseVariableItem.ATTRIBUTE_CASE_ID)) {
            throw new APIException(format("Filter '%s' must be specified", CaseVariableItem.ATTRIBUTE_CASE_ID));
        }
    }
