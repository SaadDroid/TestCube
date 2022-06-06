public Gossip update(ClusterNodeId localNodeId, GossipNodeState modified) {
        return update(localNodeId, singletonList(modified));
    }
