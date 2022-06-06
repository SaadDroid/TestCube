public void checkNotifyContext(NotifyContext notifyContext) throws MissingRequestParameterException {

        if (nullOrEmpty(notifyContext.getSubscriptionId())) {
            throw new MissingRequestParameterException("subscriptionId", "string");
        }
        if (nullOrEmpty(notifyContext.getOriginator())){
            throw new MissingRequestParameterException("originator", "URI");
        }
        if (nullOrEmpty(notifyContext.getContextElementResponseList()))  {
            throw new MissingRequestParameterException("contextElementResponse", "List<ContextElementResponse>");
        }
        for (ContextElementResponse contextElementResponse : notifyContext.getContextElementResponseList()) {
            checkContextElementResponse(contextElementResponse);
        }
    }
