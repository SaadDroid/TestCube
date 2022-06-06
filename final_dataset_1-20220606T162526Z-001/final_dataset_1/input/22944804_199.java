public static Promise<QueryResponse, ResourceException> perform(QueryResourceHandler handler, QueryRequest request,
                                                             List<ResourceResponse> resources) {

        if (isSortingRequested(request)) {
            resources = sortItems(request, resources);
        }

        if (isPagingRequested(request)) {
            handler = createPagingHandler(handler, request);
        }

        int handledCount = handleResources(handler, resources);
        QueryResponse response = generateQueryResponse(request, resources.size(), handledCount);
        return Promises.newResultPromise(response);
    }
