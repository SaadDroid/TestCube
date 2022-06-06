@Override
    public Promise<QueryResponse, ResourceException> queryCollection(Context context, QueryRequest request,
            QueryResourceHandler handler) {

        final Set<String> conditionTypeNames = new TreeSet<>();
        List<ResourceResponse> conditionTypes = new ArrayList<>();

        final String principalName = PrincipalRestUtils.getPrincipalNameFromServerContext(context);

        conditionTypeNames.addAll(entitlementRegistry.getConditionsShortNames());

        for (String conditionTypeName : conditionTypeNames) {
            final Class<? extends EntitlementCondition> conditionClass =
                    entitlementRegistry.getConditionType(conditionTypeName);

            if (conditionClass == null) {
                if (debug.warningEnabled()) {
                    debug.warning("ConditionTypesResource :: QUERY by " + principalName +
                            ": Requested condition short name not found: " + conditionTypeName);
                }
                continue;
            }

            final JsonValue json = jsonify(conditionClass, conditionTypeName,
                    LogicalCondition.class.isAssignableFrom(conditionClass));

            if (json != null) {
                conditionTypes.add(newResourceResponse(json.get(JSON_OBJ_TITLE).asString(), null, json));
            }
        }

        QueryResponsePresentation.enableDeprecatedRemainingQueryResponse(request);
        return QueryResponsePresentation.perform(handler, request, conditionTypes);
    }
