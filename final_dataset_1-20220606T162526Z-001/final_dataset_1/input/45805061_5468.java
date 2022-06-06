@Override
  public ManageablePortfolioNode getNode(UniqueId nodeId) {
    ArgumentChecker.notNull(nodeId, "nodeId");
    ManageablePortfolioNode node = _storeNodes.get(nodeId.getObjectId());
    if (node == null) {
      throw new DataNotFoundException("Node not found: " + nodeId);
    }
    if (isCloneResults()) {
      return clonePortfolioNode(node);
    } else {
      return node;
    }
  }
