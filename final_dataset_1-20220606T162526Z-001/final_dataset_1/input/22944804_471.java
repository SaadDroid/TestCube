@Override
    public Object eval(final String script, final ScriptContext scriptContext) throws ScriptException {
        sandbox.register();
        try {
            return realEngine.eval(script, scriptContext);
        } finally {
            sandbox.unregister();
        }
    }
