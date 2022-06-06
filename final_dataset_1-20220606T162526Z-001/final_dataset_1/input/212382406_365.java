@Override
  public List<DatanodeDetails> chooseDatanodes(
      List<DatanodeDetails> excludedNodes, List<DatanodeDetails> favoredNodes,
      int nodesRequired, final long sizeRequired) throws SCMException {
    Preconditions.checkArgument(nodesRequired > 0);
    metrics.incrDatanodeRequestCount(nodesRequired);
    int datanodeCount = networkTopology.getNumOfLeafNode(NetConstants.ROOT);
    int excludedNodesCount = excludedNodes == null ? 0 : excludedNodes.size();
    if (datanodeCount < nodesRequired + excludedNodesCount) {
      throw new SCMException("No enough datanodes to choose. " +
          "TotalNode = " + datanodeCount +
          "RequiredNode = " + nodesRequired +
          "ExcludedNode = " + excludedNodesCount, null);
    }
    List<DatanodeDetails> mutableFavoredNodes = favoredNodes;
    // sanity check of favoredNodes
    if (mutableFavoredNodes != null && excludedNodes != null) {
      mutableFavoredNodes = new ArrayList<>();
      mutableFavoredNodes.addAll(favoredNodes);
      mutableFavoredNodes.removeAll(excludedNodes);
    }
    int favoredNodeNum = mutableFavoredNodes == null? 0 :
        mutableFavoredNodes.size();

    List<Node> chosenNodes = new ArrayList<>();
    int favorIndex = 0;
    if (excludedNodes == null || excludedNodes.isEmpty()) {
      // choose all nodes for a new pipeline case
      // choose first datanode from scope ROOT or from favoredNodes if not null
      Node favoredNode = favoredNodeNum > favorIndex ?
          mutableFavoredNodes.get(favorIndex) : null;
      Node firstNode;
      if (favoredNode != null) {
        firstNode = favoredNode;
        favorIndex++;
      } else {
        firstNode = chooseNode(null, null, sizeRequired);
      }
      chosenNodes.add(firstNode);
      nodesRequired--;
      if (nodesRequired == 0) {
        return Arrays.asList(chosenNodes.toArray(new DatanodeDetails[0]));
      }

      // choose second datanode on the same rack as first one
      favoredNode = favoredNodeNum > favorIndex ?
          mutableFavoredNodes.get(favorIndex) : null;
      Node secondNode;
      if (favoredNode != null &&
          networkTopology.isSameParent(firstNode, favoredNode)) {
        secondNode = favoredNode;
        favorIndex++;
      } else {
        secondNode = chooseNode(chosenNodes, firstNode, sizeRequired);
      }
      chosenNodes.add(secondNode);
      nodesRequired--;
      if (nodesRequired == 0) {
        return Arrays.asList(chosenNodes.toArray(new DatanodeDetails[0]));
      }

      // choose remaining datanodes on different rack as first and second
      return chooseNodes(null, chosenNodes, mutableFavoredNodes, favorIndex,
          nodesRequired, sizeRequired);
    } else {
      List<Node> mutableExcludedNodes = new ArrayList<>();
      mutableExcludedNodes.addAll(excludedNodes);
      // choose node to meet replication requirement
      // case 1: one excluded node, choose one on the same rack as the excluded
      // node, choose others on different racks.
      Node favoredNode;
      if (excludedNodes.size() == 1) {
        favoredNode = favoredNodeNum > favorIndex ?
            mutableFavoredNodes.get(favorIndex) : null;
        Node firstNode;
        if (favoredNode != null &&
            networkTopology.isSameParent(excludedNodes.get(0), favoredNode)) {
          firstNode = favoredNode;
          favorIndex++;
        } else {
          firstNode = chooseNode(mutableExcludedNodes, excludedNodes.get(0),
              sizeRequired);
        }
        chosenNodes.add(firstNode);
        nodesRequired--;
        if (nodesRequired == 0) {
          return Arrays.asList(chosenNodes.toArray(new DatanodeDetails[0]));
        }
        // choose remaining nodes on different racks
        return chooseNodes(null, chosenNodes, mutableFavoredNodes, favorIndex,
            nodesRequired, sizeRequired);
      }
      // case 2: two or more excluded nodes, if these two nodes are
      // in the same rack, then choose nodes on different racks, otherwise,
      // choose one on the same rack as one of excluded nodes, remaining chosen
      // are on different racks.
      for(int i = 0; i < excludedNodesCount; i++) {
        for (int j = i + 1; j < excludedNodesCount; j++) {
          if (networkTopology.isSameParent(
              excludedNodes.get(i), excludedNodes.get(j))) {
            // choose remaining nodes on different racks
            return chooseNodes(mutableExcludedNodes, chosenNodes,
                mutableFavoredNodes, favorIndex, nodesRequired, sizeRequired);
          }
        }
      }
      // choose one data on the same rack with one excluded node
      favoredNode = favoredNodeNum > favorIndex ?
          mutableFavoredNodes.get(favorIndex) : null;
      Node secondNode;
      if (favoredNode != null && networkTopology.isSameParent(
          mutableExcludedNodes.get(0), favoredNode)) {
        secondNode = favoredNode;
        favorIndex++;
      } else {
        secondNode =
            chooseNode(chosenNodes, mutableExcludedNodes.get(0), sizeRequired);
      }
      chosenNodes.add(secondNode);
      mutableExcludedNodes.add(secondNode);
      nodesRequired--;
      if (nodesRequired == 0) {
        return Arrays.asList(chosenNodes.toArray(new DatanodeDetails[0]));
      }
      // choose remaining nodes on different racks
      return chooseNodes(mutableExcludedNodes, chosenNodes, mutableFavoredNodes,
          favorIndex, nodesRequired, sizeRequired);
    }
  }
