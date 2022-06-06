@Override
    public GraphQueryResult evaluate()
            throws QueryEvaluationException {
        try {
            sync();
            return getMarkLogicClient().sendGraphQuery(getQueryString(),getBindings(),getIncludeInferred(),getBaseURI());
        } catch (IOException e) {
            throw new QueryEvaluationException(e);
        } catch (MarkLogicSesameException e) {
            throw new QueryEvaluationException(e);
        }
    }
