@Override
    public boolean canHandle(ActionParameter actionParameter) {
        if (actionParameter.getExpression() == null) {
            return false;
        }
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript"); //$NON-NLS-1$
        try {
            if (actionParameter.getInputData() != null && actionParameter.getInputData() instanceof Number) {

                return (Boolean) engine
                        .eval(actionParameter.getInputData().toString() + actionParameter.getExpression());
            } else if (actionParameter.getInputData() != null && actionParameter.getInputData() instanceof Date) {
                String varName = actionParameter.getColumn() + "Date"; //$NON-NLS-1$
                engine.put(varName, actionParameter.getInputData());
                return (Boolean) engine.eval("" + varName + actionParameter.getExpression()); //$NON-NLS-1$
            } else {
                String varName = actionParameter.getColumn() + "String"; //$NON-NLS-1$
                engine.put(varName, actionParameter.getInputData());
                return (Boolean) engine.eval("" + varName + actionParameter.getExpression()); //$NON-NLS-1$

            }
        } catch (ScriptException e) {
            LOGGER.error(e.getMessage(), e);
            // no need implement
        }
        return false;
    }
