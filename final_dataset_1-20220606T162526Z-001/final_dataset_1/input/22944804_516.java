@Override
    public Promise<QueryResponse, ResourceException> queryCollection(Context serverContext,
            QueryRequest queryRequest, QueryResourceHandler queryResultHandler) {
        if (!queryRequest.getQueryFilter().toString().equals("true")) {
            return new BadRequestException("Invalid query").asPromise();
        }

        Set<ResourceSetLabel> labels;
        try {
            labels = labelStore.list(getRealm(serverContext), getUserName(serverContext));
        } catch (ResourceException e) {
            return new BadRequestException("Error retrieving labels.").asPromise();
        }

        LocaleContext localeContext = localeContextProvider.get();
        localeContext.setLocale(serverContext);

        for (ResourceSetLabel label : labels) {
            try {
                label = resolveLabelName(contextHelper.getRealm(serverContext), label, localeContext, serverContext);
            } catch (InternalServerErrorException e) {
                debug.error("Could not resolve Resource Server label name. id: {}, name: {}", label.getId(),
                        label.getName(), e);
            }
            queryResultHandler.handleResource(newResourceResponse(label.getId(),
                    String.valueOf(label.asJson().getObject().hashCode()), label.asJson()));
        }

        return newResultPromise(newQueryResponse());
    }
