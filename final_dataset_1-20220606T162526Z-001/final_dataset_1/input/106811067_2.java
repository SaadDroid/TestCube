public <T> T findOne(QuerydslPredicateExecutor<T> predicateExecutor,
                         Predicate predicate,
                         String notFoundMessage) {
        Optional<T> findResult = predicateExecutor.findOne(predicate);
        return getEntity(findResult,
                         notFoundMessage);
    }
