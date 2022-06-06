public void onMessageEvent(final String eventData) {
        try {
            final JSONValue root = JSONParser.parseStrict(eventData);
            final JSONObject fullJSONMessage = root.isObject();
            if (isActionWatched(fullJSONMessage)) {
                handleJSONMessage(fullJSONMessage);
            }
        } catch (final Exception e) {
            GWT.log("Error while parsing content of message", e);
        }
    }
