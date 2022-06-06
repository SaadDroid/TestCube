public void fromJson(JsonMapObject obj, String json) {
        String theJson = json.trim();
        JsonObjectSettable settable = new JsonObjectSettable(obj);
        readJsonObjectAsSettable(settable, theJson.substring(1, theJson.length() - 1));
    }
