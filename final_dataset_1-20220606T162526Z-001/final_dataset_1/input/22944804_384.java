@Override
    public Promise<QueryResponse, ResourceException> queryCollection(Context context, QueryRequest request,
            QueryResourceHandler resultHandler) {
        final QueryFilter<JsonPointer> filter = request.getQueryFilter();
        try {
            final Set<ScriptConfiguration> configs;
            if (filter == null) {
                configs = serviceFactory.create(getContextSubject(context), getRealm(context)).getAll();
            } else {
                QueryFilter<String> stringQueryFilter = filter.accept(
                        new QueryByStringFilterConverter(), null);
                configs = serviceFactory.create(getContextSubject(context), getRealm(context)).get(stringQueryFilter);
            }

            List<ResourceResponse> results = new ArrayList<>();
            for (ScriptConfiguration configuration : configs) {
                String id = configuration.getId();
                results.add(newResourceResponse(id, null, asJson(configuration)));
            }

            QueryResponsePresentation.enableDeprecatedRemainingQueryResponse(request);
            return QueryResponsePresentation.perform(resultHandler, request, results);
        } catch (ScriptException se) {
            return exceptionMappingHandler.handleError(context, request, se).asPromise();
        }
    }
