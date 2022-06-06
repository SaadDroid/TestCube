@Override
    public boolean evaluate() throws QueryEvaluationException {
        try {
            sync();
            return getMarkLogicClient().sendBooleanQuery(getQueryString(), getBindings(), getIncludeInferred(),getBaseURI());
        }catch (RepositoryException e) {
            throw new QueryEvaluationException(e.getMessage(), e);
        }catch (MalformedQueryException e) {
            throw new QueryEvaluationException(e.getMessage(), e);
        }catch (IOException e) {
            throw new QueryEvaluationException(e.getMessage(), e);
        }catch(FailedRequestException e){
            throw new QueryEvaluationException(e.getMessage(), e);
        }
    }
