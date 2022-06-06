public Script getScriptPubKey() throws ScriptException {
        if (scriptPubKey == null) {
            scriptPubKey = new Script(scriptBytes);
        }
        return scriptPubKey;
    }
