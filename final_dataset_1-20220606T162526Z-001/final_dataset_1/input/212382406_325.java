@Override
  public List<DatanodeDetails> chooseDatanodes(
      List<DatanodeDetails> excludedNodes, List<DatanodeDetails> favoredNodes,
      int nodesRequired, final long sizeRequired) throws SCMException {
    // Get a list of viable nodes based on criteria
    // and make sure excludedNodes are excluded from list.
    List<DatanodeDetails> healthyNodes =
        filterViableNodes(excludedNodes, nodesRequired);

    // Randomly picks nodes when all nodes are equal or factor is ONE.
    // This happens when network topology is absent or
    // all nodes are on the same rack.
    if (checkAllNodesAreEqual(nodeManager.getClusterNetworkTopologyMap())) {
      return super.getResultSet(nodesRequired, healthyNodes);
    } else {
      // Since topology and rack awareness are available, picks nodes
      // based on them.
      return this.getResultSet(nodesRequired, healthyNodes);
    }
  }
