protected Map<String, Serializable> getEvaluateConditionExpressions(final APISession session, final List<FormAction> actions, final Locale locale,
            final Map<String, Serializable> context, final long processDefinitionID, final long activityInstanceID,
            final IFormExpressionsAPI formExpressionsAPI)
                    throws BPMExpressionEvaluationException, BPMEngineException {
        Map<String, Serializable> evaluateConditionExpressions;
        final List<Expression> conditionsList = new ArrayList<Expression>();

        for (Integer i = 0; i < actions.size(); i++) {
            final FormAction action = actions.get(i);
            final Expression conditionExpression = action.getConditionExpression();
            if (conditionExpression != null) {
                conditionExpression.setName(FORM_ACTION_CONDITION + i);
                conditionsList.add(conditionExpression);
            }
        }

        if (activityInstanceID != -1) {
            evaluateConditionExpressions = formExpressionsAPI.evaluateActivityInitialExpressions(session, activityInstanceID, conditionsList, locale,
                    true, context);
        } else if (processDefinitionID != -1) {
            evaluateConditionExpressions = formExpressionsAPI.evaluateProcessInitialExpressions(session, processDefinitionID, conditionsList, locale,
                    context);
        } else {
            evaluateConditionExpressions = new HashMap<String, Serializable>();
        }
        return evaluateConditionExpressions;
    }
