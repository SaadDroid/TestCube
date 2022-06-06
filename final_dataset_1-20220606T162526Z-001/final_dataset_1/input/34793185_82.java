@Override
    public PluggableIAction unmarshal(final String iActionString) throws RuleModelDRLPersistenceException {
        String[] parameters = PersistenceExtensionUtils.unwrapParenthesis(iActionString).split("\\s*,\\s*");

        if (parameters.length > 0 && "kcontext".equals(parameters[0])) {
            if (parameters.length == 2) {
                return new ActionMediumConstraintMatch(PersistenceExtensionUtils.extractConstraintMatchValue(parameters[1]));
            }
        }

        throw new RuleModelDRLPersistenceException(PersistenceExtensionUtils.EXCEPTION_MESSAGE_BASE + iActionString);
    }
