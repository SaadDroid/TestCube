@Override
    protected void processMessage(Message message, TestContext context) {
        if (message.getPayload() == null || !StringUtils.hasText(message.getPayload(String.class))) {
            return;
        }

        JSONParser parser = new JSONParser(JSONParser.MODE_JSON_SIMPLE);

        try {
            Object json = parser.parse(message.getPayload(String.class));

            if (json instanceof JSONObject) {
                traverseJsonData((JSONObject) json, "", context);
            } else if (json instanceof JSONArray) {
                JSONObject tempJson = new JSONObject();
                tempJson.put("root", json);
                traverseJsonData(tempJson, "", context);
            } else {
                throw new CitrusRuntimeException("Unsupported json type " + json.getClass());
            }

            message.setPayload(json.toString());
        } catch (ParseException e) {
            log.warn("Data dictionary unable to parse JSON object", e);
        }
    }
