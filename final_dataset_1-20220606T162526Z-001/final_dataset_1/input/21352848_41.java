public static Multiset<String> getIdentifiers(String tex, String url) throws XPathExpressionException, ParserConfigurationException, SAXException, IOException, TransformerException {
    final Multiset<String> strings = HashMultiset.create();
    //long t0 = System.nanoTime();
    String json = makeRequest(tex, url);
    if (tex.length() == 0) {
      return strings;
    }
    //System.out.println((System.nanoTime()-t0)/1000000+"ms for "+tex);
    try {
      JSONObject jsonObject = (JSONObject) JSONSerializer.toJSON(json);
      JSONArray identifiers = jsonObject.getJSONArray("identifiers");
      strings.addAll(identifiers);
    } catch (Exception e) {
      System.out.println(tex + " Parsing problem");
      System.out.println("Retrieved: " + json);
      //e.printStackTrace();
    }
    return strings;
  }
