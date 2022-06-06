public Node selectSingleNode(Node context, String xpath)
      throws XPathExpressionException {
    return (Node) createXpath().evaluate(xpath, context, XPathConstants.NODE);
  }
