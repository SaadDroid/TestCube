public GossipNodeState merge(GossipNodeState other) {
        if (status != other.status || version != other.version) {
            GossipNodeStatus newStatus;
            long newVersion;
            Set<ClusterNodeId> newSuspected;
            ClusterNode newNode;

            if (status.compareTo(other.status) >= 0) {
                newStatus = status;
                newNode = node;
            } else {
                newStatus = other.status;
                newNode = other.node;
            }

            if (version >= other.version) {
                newVersion = version;
                newSuspected = suspected;
            } else {
                newVersion = other.version;
                newSuspected = other.suspected;
            }

            return new GossipNodeState(newNode, newStatus, newVersion, newSuspected);
        } else {
            return this;
        }
    }
