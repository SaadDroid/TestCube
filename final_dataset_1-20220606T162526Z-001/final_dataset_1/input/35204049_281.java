@Override
    public Result getResources(Request request) throws InvalidQueryException, ResourceNotFoundException {
        AtlasQuery atlasQuery = queryFactory.createEntityTagQuery(request);
        return new Result(atlasQuery.execute());
    }
