@Override
  public MetadataElement resolveXpath(Document doc, XPath xpath, String expr) throws Exception {
    return new MetadataElement(getMetadataKey(), XpathQueryHelper.resolveSingleTextItem(doc, xpath, expr, allowEmptyResults()));
  }
