public static List<String> getAliases(String qid) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException, TransformerException, URISyntaxException {
        final ArrayList<String> strings = new ArrayList<>();
        String json = getAlias(qid, "en");
        try {
            JSONObject Ojson = (JSONObject) JSONSerializer.toJSON(json);
            if (Ojson.getInt("success") < 1) {
                return Arrays.asList(new String[] {"fail!"});
            }
            try {
                JSONArray results = ((JSONObject) ((JSONObject) ((JSONObject) Ojson.get("entities")).get(qid)).get("aliases")).getJSONArray("en");
                for (Object result : results) {
                    final JSONObject sres = (JSONObject) result;
                    strings.add((String) sres.get("value"));
                }
            } catch (JSONException e) {
                Logger.error(((JSONObject) ((JSONObject) Ojson.get("entities")).get(qid)).get("aliases"),e.getMessage());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return strings;
    }
