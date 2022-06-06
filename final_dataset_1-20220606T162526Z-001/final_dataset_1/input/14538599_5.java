@Override
    public PojoQueryBuilder<P> gt(String facetName) {
        return append(facetName, QueryBuilder::gt);
    }
