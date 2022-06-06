public JsonObject toJson() {
        JsonObject result = new JsonObject();
        result.addProperty("text", text);
        result.addProperty("url", url);
        result.addProperty("relevance", relevance);
        return result;
    }
