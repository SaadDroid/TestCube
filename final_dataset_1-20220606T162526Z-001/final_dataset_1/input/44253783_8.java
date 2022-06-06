public String getSingleTextItem(String xp, Node documentNode) {
    try {
      return xpath.selectSingleTextItem(documentNode, xp);
    }
    catch (Exception e) {
      return null;
    }
  }
