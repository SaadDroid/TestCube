@Override
    public SagaResponse with(final String datasourceName, final String sql, final List<List<String>> sagaParameters) {
        if (Strings.isNullOrEmpty(sql)) {
            return new SuccessfulSagaResponse("Skip empty transaction/compensation");
        }
        if (SagaDefinitionFactory.ROLLBACK_TAG.equals(sql)) {
            shardingSQLTransaction.changeAllLogicTransactionStatus(ExecuteStatus.COMPENSATING);
            throw new TransportFailedException("Forced Rollback tag has been checked, saga will rollback this transaction");
        }
        Optional<SQLTransaction> sqlTransaction = shardingSQLTransaction.findSQLTransaction(datasourceName, sql, sagaParameters);
        return sqlTransaction.isPresent() && isExecuteSQL(sqlTransaction.get().getExecuteStatus()) ? executeSQL(datasourceName, sql, sagaParameters) : new JsonSuccessfulSagaResponse("{}");
    }
