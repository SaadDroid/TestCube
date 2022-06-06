@Override
    public GetQueryTagValuesResponseData executeGetQueryTagValues(
            final AciParameters aciParameters,
            final QueryType queryType
    ) throws AciErrorException {
        return executeQueryDiscardingBlacklist(aciParameters, queryType, queryExecutor::executeGetQueryTagValues);
    }
