@Override
    @SuppressWarnings("unchecked")
    public <T> T evaluateScript(final ScriptObject script, final Bindings bindings) throws ScriptException {
        Reject.ifNull(script);

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("Evaluating script: " + script);
        }

        final ScriptEngine engine = getScriptEngineFor(script);
        final Bindings variableBindings = mergeBindings(script.getBindings(), bindings);
        final ScriptContext context = buildScriptContext(variableBindings);

        return (T) engine.eval(script.getScript(), context);
    }
