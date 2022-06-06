public void checkSubscribeContext(SubscribeContext subscribeContext) throws MissingRequestParameterException {
        if (nullOrEmpty(subscribeContext.getEntityIdList())) {
            throw new MissingRequestParameterException("entities", "List<EntityId>");
        }
        for(EntityId entityId: subscribeContext.getEntityIdList()) {
            checkEntityId(entityId);
        }
        if (nullOrEmpty(subscribeContext.getReference())){
            throw new MissingRequestParameterException("reference", "URI");
        }
        if (subscribeContext.getRestriction() != null) {
            if (nullOrEmpty(subscribeContext.getRestriction().getAttributeExpression())
                    && nullOrEmpty(subscribeContext.getRestriction().getScopes())) {
                throw new MissingRequestParameterException("attributeExpression or scopes", "string");
            }
        }
    }
