public static Bindings create(ScriptEngineManager scriptEngineManager, Map<String, Object> scriptEngineBindings, Row input) {
        Bindings bindings = scriptEngineManager.getBindings();
        bindings.put("$ROW", input);
        final Row emptyRow = new Row();
        bindings.put("$EMPTY", emptyRow);
        bindings.put("$MEMORY", input.getMemory());
        input.getColumns().forEach(c -> bindings.put(c.getName(), c));
        if (scriptEngineBindings != null) {
            bindings.putAll(scriptEngineBindings);
        }
        return bindings;
    }
