static void checkError(String jsonString) throws SearcherException {
        if (StringUtils.isBlank(jsonString)) {
            throw new SearcherException("JSON response is empty.");
        }
        try {
            JsonObject jsonObject = new JsonObject(jsonString);
            JsonObject jsonError = jsonObject.getJsonObject("error");
            if (jsonError != null) {
                int errorCode = jsonError.getInt("code");
                String message = jsonError.getString("message");
                throw new SearcherException("Error from Google Custom Search API: " + message + " (" + errorCode + ").");
            }
        } catch (JsonException e) {
            throw new SearcherException("Could not parse JSON response ('" + jsonString + "').", e);
        }
    }
