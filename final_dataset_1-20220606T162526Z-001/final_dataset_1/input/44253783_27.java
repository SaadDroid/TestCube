@Override
  public Document merge(Document original, Document newDoc) throws Exception {
    if (StringUtils.isEmpty(getXpathToParentNode())) {
      throw new Exception("No parent node configured");
    }
    Document resultDoc = original;
    XmlUtils xml = create(resultDoc);
    Node parent = resolve(xml, getXpathToParentNode());
    if (parent.getOwnerDocument() == null) {
      throw new Exception("Invalid xpath-to-parent-node [" + getXpathToParentNode() + "]");
    }
    xml.appendNode(newDoc.getDocumentElement(), parent);
    return resultDoc;
  }
