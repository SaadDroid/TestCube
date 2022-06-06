public void checkUpdateContextSubscription(UpdateContextSubscription updateContextSubscription) throws MissingRequestParameterException {
        if (nullOrEmpty(updateContextSubscription.getSubscriptionId())){
            throw new MissingRequestParameterException("subscriptionId", "String");
        }
        if (updateContextSubscription.getRestriction() != null) {
            if (nullOrEmpty(updateContextSubscription.getRestriction().getAttributeExpression())
                    && nullOrEmpty(updateContextSubscription.getRestriction().getScopes())) {
                throw new MissingRequestParameterException("attributeExpression or scopes", "string");
            }
        }
    }
