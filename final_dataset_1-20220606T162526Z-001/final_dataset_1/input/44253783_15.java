public String selectSingleTextItem(Node context, String xpath)
      throws XPathExpressionException {
    return (String) createXpath().evaluate(xpath, context, XPathConstants.STRING);
  }
