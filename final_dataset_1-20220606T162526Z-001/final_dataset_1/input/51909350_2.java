public void checkUpdateContext(UpdateContext updateContext) throws MissingRequestParameterException {

        if (updateContext.getUpdateAction() == null) {
            throw new MissingRequestParameterException("updateAction", "string");
        }
        if (nullOrEmpty(updateContext.getContextElements())) {
            throw new MissingRequestParameterException("contextElements", "List<ContextElement>");
        }
        for (ContextElement contextElement : updateContext.getContextElements()) {
            checkContextElement(contextElement);
        }
    }
