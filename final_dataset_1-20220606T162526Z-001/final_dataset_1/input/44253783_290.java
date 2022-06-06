@Deprecated
  public static Document createDocument(AdaptrisMessage msg) throws ParserConfigurationException, IOException, SAXException {
    return createDocument(msg, false);
  }
