@Override
    public List<AtlasVertex> execute() {
        if (LOG.isDebugEnabled()) {
            LOG.debug("==> ClassificationSearchProcessor.execute({})", context);
        }

        List<AtlasVertex> ret = new ArrayList<>();

        AtlasPerfTracer perf = null;

        if (AtlasPerfTracer.isPerfTraceEnabled(PERF_LOG)) {
            perf = AtlasPerfTracer.getPerfTracer(PERF_LOG, "ClassificationSearchProcessor.execute(" + context +  ")");
        }

        try {
            final int     startIdx   = context.getSearchParameters().getOffset();
            final int     limit      = context.getSearchParameters().getLimit();

            // query to start at 0, even though startIdx can be higher - because few results in earlier retrieval could
            // have been dropped: like non-active-entities or duplicate-entities (same entity pointed to by multiple
            // classifications in the result)
            //
            // first 'startIdx' number of entries will be ignored
            int qryOffset = 0;
            int resultIdx = qryOffset;

            final Set<String>       processedGuids         = new HashSet<>();
            final List<AtlasVertex> entityVertices         = new ArrayList<>();
            final List<AtlasVertex> classificationVertices = new ArrayList<>();

            final String          sortBy                = context.getSearchParameters().getSortBy();
            final SortOrder       sortOrder             = context.getSearchParameters().getSortOrder();

            for (; ret.size() < limit; qryOffset += limit) {
                entityVertices.clear();
                classificationVertices.clear();

                if (context.terminateSearch()) {
                    LOG.warn("query terminated: {}", context.getSearchParameters());

                    break;
                }

                boolean isLastResultPage = true;

                if (indexQuery != null) {
                    Iterator<AtlasIndexQuery.Result> queryResult;
                    if (StringUtils.isNotEmpty(sortBy)) {
                        Order qrySortOrder = sortOrder == SortOrder.ASCENDING ? Order.asc : Order.desc;
                        queryResult = indexQuery.vertices(qryOffset, limit, sortBy, qrySortOrder);
                    } else {
                        queryResult = indexQuery.vertices(qryOffset, limit);
                    }

                    getVerticesFromIndexQueryResult(queryResult, entityVertices);
                    isLastResultPage = entityVertices.size() < limit;

                    // Do in-memory filtering
                    CollectionUtils.filter(entityVertices, traitPredicate);
                    CollectionUtils.filter(entityVertices, isEntityPredicate);

                } else {
                    if (classificationIndexQuery != null) {

                        Iterator<AtlasIndexQuery.Result> queryResult = classificationIndexQuery.vertices(qryOffset, limit);

                        getVerticesFromIndexQueryResult(queryResult, classificationVertices);

                        isLastResultPage = classificationVertices.size() < limit;

                        CollectionUtils.filter(classificationVertices, inMemoryPredicate);
                    } else if (tagGraphQueryWithAttributes != null) {

                        Iterator<AtlasVertex> queryResult = tagGraphQueryWithAttributes.vertices(qryOffset, limit).iterator();

                        getVertices(queryResult, classificationVertices);

                        isLastResultPage = classificationVertices.size() < limit;

                        CollectionUtils.filter(classificationVertices, inMemoryPredicate);
                    }
                }

                // Since tag filters are present, we need to collect the entity vertices after filtering the classification
                // vertex results (as these might be lower in number)
                if (CollectionUtils.isNotEmpty(classificationVertices)) {
                    for (AtlasVertex classificationVertex : classificationVertices) {
                        Iterable<AtlasEdge> edges = classificationVertex.getEdges(AtlasEdgeDirection.IN, Constants.CLASSIFICATION_LABEL);

                        for (AtlasEdge edge : edges) {
                            AtlasVertex entityVertex = edge.getOutVertex();

                            String guid = AtlasGraphUtilsV2.getIdFromVertex(entityVertex);

                            if (processedGuids.contains(guid)) {
                                continue;
                            }

                            entityVertices.add(entityVertex);

                            processedGuids.add(guid);
                        }
                    }
                }

                if (whiteSpaceFilter) {
                    filterWhiteSpaceClassification(entityVertices);
                }
                    // Do in-memory filtering
                CollectionUtils.filter(entityVertices, isEntityPredicate);
                if (activePredicate != null) {
                    CollectionUtils.filter(entityVertices, activePredicate);
                }

                super.filter(entityVertices);

                resultIdx = collectResultVertices(ret, startIdx, limit, resultIdx, entityVertices);

                if (isLastResultPage) {
                    break;
                }
            }
        } finally {
            AtlasPerfTracer.log(perf);
        }

        if (LOG.isDebugEnabled()) {
            LOG.debug("<== ClassificationSearchProcessor.execute({}): ret.size()={}", context, ret.size());
        }

        return ret;
    }
