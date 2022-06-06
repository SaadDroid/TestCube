static Set<String> parseStaleDataNodeList(String liveNodeJsonString, final int blockThreshold,
      final Log log) throws IOException {
    final Set<String> dataNodesToReport = new HashSet<>();

    JsonFactory fac = new JsonFactory();
    JsonParser parser = fac.createJsonParser(IOUtils.toInputStream(liveNodeJsonString, StandardCharsets.UTF_8.name()));

    int objectDepth = 0;
    String currentNodeAddr = null;
    for (JsonToken tok = parser.nextToken(); tok != null; tok = parser.nextToken()) {
      if (tok == JsonToken.START_OBJECT) {
        objectDepth++;
      } else if (tok == JsonToken.END_OBJECT) {
        objectDepth--;
      } else if (tok == JsonToken.FIELD_NAME) {
        if (objectDepth == 1) {
          // This is where the Datanode identifiers are stored
          currentNodeAddr = parser.getCurrentName();
        } else if (objectDepth == 2) {
          if (parser.getCurrentName().equals("numBlocks")) {
            JsonToken valueToken = parser.nextToken();
            if (valueToken != JsonToken.VALUE_NUMBER_INT || currentNodeAddr == null) {
              throw new IOException(String.format("Malformed LiveNodes JSON; got token = %s; currentNodeAddr = %s: %s",
                  valueToken, currentNodeAddr, liveNodeJsonString));
            }
            int numBlocks = parser.getIntValue();
            if (numBlocks < blockThreshold) {
              log.debug(String.format("Queueing Datanode <%s> for block report; numBlocks = %d",
                  currentNodeAddr, numBlocks));
              dataNodesToReport.add(currentNodeAddr);
            } else {
              log.debug(String.format("Not queueing Datanode <%s> for block report; numBlocks = %d",
                  currentNodeAddr, numBlocks));
            }
          }
        }
      }
    }
    return dataNodesToReport;
  }
