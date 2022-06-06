@Override
    public void exportStatements(Resource subject, IRI predicate, Value object, boolean includeInferred, RDFHandler handler, Resource... contexts) throws RepositoryException, RDFHandlerException {
        try {
            RepositoryResult<Statement> st = this.getStatements(subject, predicate, object, includeInferred, contexts);
            handler.startRDF();
            QueryResults.stream(st).forEach(handler::handleStatement);
            handler.endRDF();
        }
        catch (MalformedQueryException | QueryEvaluationException e) {
            throw new RepositoryException(e);
        }
    }
