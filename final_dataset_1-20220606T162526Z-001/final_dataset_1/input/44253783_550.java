@Override
  public Node resolveXpath(Document doc, XPath xpath, String expr) throws CoreException {
    return XpathQueryHelper.resolveSingleNode(doc, xpath, expr, allowEmptyResults());
  }
