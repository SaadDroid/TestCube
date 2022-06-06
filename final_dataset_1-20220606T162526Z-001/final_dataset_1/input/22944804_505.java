@Override
    public Promise<Pair<QueryResponse, Collection<UmaPolicy>>, ResourceException> queryPolicies(final Context context,
            final QueryRequest umaQueryRequest) {

        if (umaQueryRequest.getQueryExpression() != null) {
            return new BadRequestException("Query expressions not supported").asPromise();
        }

        QueryRequest request = Requests.newQueryRequest("");
        final AggregateQuery<QueryFilter<JsonPointer>, QueryFilter<JsonPointer>> filter = umaQueryRequest.getQueryFilter()
                .accept(new AggregateUmaPolicyQueryFilter(), new AggregateQuery<QueryFilter<JsonPointer>, QueryFilter<JsonPointer>>());

        String queryId = umaQueryRequest.getQueryId();
        if (queryId != null && queryId.equals("searchAll")) {
            request.setQueryFilter(QueryFilter.<JsonPointer>alwaysTrue());
        } else {
            String resourceOwnerUid = getResourceOwnerUid(context);
            if (filter.getFirstQuery() == null) {
                request.setQueryFilter(QueryFilter.equalTo(new JsonPointer("createdBy"), resourceOwnerUid));
            } else {
                request.setQueryFilter(QueryFilter.and(QueryFilter.equalTo(new JsonPointer("createdBy"), resourceOwnerUid), filter.getFirstQuery()));
            }
        }
        return policyResourceDelegate.queryPolicies(context, request)
                .thenAsync(new AsyncFunction<Pair<QueryResponse, List<ResourceResponse>>, Collection<UmaPolicy>, ResourceException>() {
                    @Override
                    public Promise<Collection<UmaPolicy>, ResourceException> apply(Pair<QueryResponse, List<ResourceResponse>> value) {
                        Map<String, Set<ResourceResponse>> policyMapping = new HashMap<>();
                        for (ResourceResponse policy : value.getSecond()) {

                            String resource = policy.getContent().get("resources").asList(String.class).get(0);

                            if (!resource.startsWith(UMA_POLICY_SCHEME)) {
                                continue;
                            }
                            resource = resource.replaceFirst(UMA_POLICY_SCHEME, "");
                            if (resource.indexOf(":") > 0) {
                                resource = resource.substring(0, resource.indexOf(":"));
                            }

                            Set<ResourceResponse> mapping = policyMapping.get(resource);
                            if (mapping == null) {
                                mapping = new HashSet<>();
                                policyMapping.put(resource, mapping);
                            }

                            mapping.add(policy);
                        }

                        try {
                            Collection<UmaPolicy> umaPolicies = new HashSet<>();
                            for (Map.Entry<String, Set<ResourceResponse>> entry : policyMapping.entrySet()) {
                                ResourceSetDescription resourceSet = getResourceSetDescription(entry.getKey(), context);
                                UmaPolicy umaPolicy = UmaPolicy.fromUnderlyingPolicies(resourceSet, entry.getValue());
                                resolveUIDToUsername(umaPolicy.asJson());
                                umaPolicies.add(umaPolicy);
                            }
                            return newResultPromise(umaPolicies);
                        } catch (ResourceException e) {
                            return e.asPromise();
                        }
                    }
                })
                .thenAsync(new AsyncFunction<Collection<UmaPolicy>, Pair<QueryResponse, Collection<UmaPolicy>>, ResourceException>() {
                    @Override
                    public Promise<Pair<QueryResponse, Collection<UmaPolicy>>, ResourceException> apply(Collection<UmaPolicy> policies) {
                        Collection<UmaPolicy> results = policies;
                        if (filter.getSecondQuery() != null) {
                            PolicySearch search = filter.getSecondQuery().accept(new UmaPolicyQueryFilterVisitor(), new PolicySearch(policies));
                            if (AggregateQuery.Operator.AND.equals(filter.getOperator())) {
                                results.retainAll(search.getPolicies());
                            }
                        }

                        int pageSize = umaQueryRequest.getPageSize();
                        String pagedResultsCookie = umaQueryRequest.getPagedResultsCookie();
                        int pagedResultsOffset = umaQueryRequest.getPagedResultsOffset();

                        Collection<UmaPolicy> pagedPolicies = new HashSet<UmaPolicy>();
                        int count = 0;
                        for (UmaPolicy policy : results) {
                            if (count >= pagedResultsOffset * pageSize) {
                                pagedPolicies.add(policy);
                            }
                            count++;
                        }
                        int remainingPagedResults = results.size() - pagedPolicies.size();
                        if (pageSize > 0) {
                            remainingPagedResults /= pageSize;
                        }

                        return newResultPromise(Pair.of(
                                newQueryResponse(pagedResultsCookie, CountPolicy.EXACT, remainingPagedResults), pagedPolicies));
                    }
                });
    }
