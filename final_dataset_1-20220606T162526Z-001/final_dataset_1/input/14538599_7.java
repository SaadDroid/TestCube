@Override
    public PojoQueryBuilder<P> lt(String facetName) {
        return append(facetName, QueryBuilder::lt);
    }
