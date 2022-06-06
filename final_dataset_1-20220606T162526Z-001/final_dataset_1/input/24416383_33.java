public boolean evalFilter(String s, Map<String, String> record) throws ScriptException {
        Gson gson = new Gson();
        ScriptEngine engine = this.factory.getEngineByName("JavaScript");
        String recordJson = gson.toJson(record);
        engine.put("record_json", recordJson);
        try {
            s = "var record = new Object(JSON.parse(record_json));" + s;
            return (boolean) engine.eval(s);
        } catch (NullPointerException e) {
            throw new NullPointerException("The record filter should return either true or false! -- " + e.toString());
        }
    }
