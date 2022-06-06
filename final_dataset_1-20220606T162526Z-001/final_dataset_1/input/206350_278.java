protected List<? extends Query> createQueries(List<DbRowOp> dbRowOps) {
        QueryCreatorVisitor queryCreator = new QueryCreatorVisitor(dbRowOps.size());
        dbRowOps.forEach(row -> row.accept(queryCreator));
        return queryCreator.getQueryList();
    }
