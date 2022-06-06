Promise<Collection<ResourceSetDescription>, ResourceException> getResourceSets(final Context context,
            String realm, final ResourceSetWithPolicyQuery query, final String resourceOwnerId,
            final boolean augmentWithPolicies) {
        final Set<ResourceSetDescription> resourceSets;
        try {
            resourceSets = new ResourceSetSharedFilter(this, resourceOwnerId, realm)
                    .filter(resourceSetStoreFactory.create(realm).query(query.getResourceSetQuery()));
        } catch (ServerException e) {
            return new InternalServerErrorException(e).asPromise();
        }

        QueryRequest policyQuery = newQueryRequest("").setQueryId("searchAll");
        policyQuery.setQueryFilter(QueryFilter.<JsonPointer>alwaysTrue());
        return getSharedResourceSets(context, policyQuery, resourceOwnerId)
                .thenAsync(new AsyncFunction<Set<ResourceSetDescription>, Collection<ResourceSetDescription>,
                        ResourceException>() {
                    @Override
                    public Promise<Collection<ResourceSetDescription>, ResourceException> apply(
                            final Set<ResourceSetDescription> sharedResourceSets) {
                        //combine the owned ResourceSets with the shared ones, then filter based on the query
                        sharedResourceSets.addAll(resourceSets);
                        final Collection<ResourceSetDescription> filteredResourceSets = filterPolicies(resourceSets, query);

                        Promise<Collection<ResourceSetDescription>, ResourceException> resourceSetsPromise;
                        if (query.getPolicyQuery() != null) {
                            QueryRequest policyQuery = newQueryRequest("").setQueryFilter(query.getPolicyQuery());
                            resourceSetsPromise = policyService.queryPolicies(context, policyQuery)
                                    .thenAsync(new AsyncFunction<Pair<QueryResponse, Collection<UmaPolicy>>,
                                            Collection<ResourceSetDescription>, ResourceException>() {
                                        @Override
                                        public Promise<Collection<ResourceSetDescription>, ResourceException> apply(
                                                Pair<QueryResponse, Collection<UmaPolicy>> result) throws ResourceException {
                                            try {
                                                return newResultPromise(combine(context, query,
                                                        filteredResourceSets, result.getSecond(), augmentWithPolicies,
                                                        resourceOwnerId));
                                            } catch (org.forgerock.oauth2.core.exceptions.NotFoundException e) {
                                                return new InternalServerErrorException(e).asPromise();
                                            } catch (ServerException e) {
                                                return new InternalServerErrorException(e).asPromise();
                                            }
                                        }
                                    });
                        } else {
                            if (augmentWithPolicies) {
                                List<Promise<ResourceSetDescription, ResourceException>> promises
                                        = new ArrayList<>();
                                PromiseImpl<ResourceSetDescription, ResourceException> kicker = PromiseImpl.create();
                                promises.add(kicker);
                                for (ResourceSetDescription resourceSet : filteredResourceSets) {
                                    promises.add(augmentWithPolicy(context, resourceSet.getId(), resourceSet));
                                }
                                resourceSetsPromise = Promises.when(promises)
                                        .thenAsync(new AsyncFunction<List<ResourceSetDescription>, Collection<ResourceSetDescription>, ResourceException>() {
                                            @Override
                                            public Promise<Collection<ResourceSetDescription>, ResourceException> apply(List<ResourceSetDescription> resourceSets) {
                                                Collection<ResourceSetDescription> resourceSetDescriptions
                                                        = new HashSet<>();
                                                for (ResourceSetDescription rs : filteredResourceSets) {
                                                    if (rs != null) {
                                                        resourceSetDescriptions.add(rs);
                                                    }
                                                }
                                                return newResultPromise(resourceSetDescriptions);
                                            }
                                        });
                                kicker.handleResult(null);
                            } else {
                                resourceSetsPromise = newResultPromise(filteredResourceSets);
                            }
                        }
                        return resourceSetsPromise;
                    }
                });
    }
