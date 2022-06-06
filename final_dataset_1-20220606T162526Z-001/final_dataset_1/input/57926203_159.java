public static InstanceIdentifier<Topology> buildOvsdbTopologyIID() {
        InstanceIdentifier<Topology> ovsdbTopologyIID = InstanceIdentifier.create(NetworkTopology.class)
            .child(Topology.class, new TopologyKey(SouthboundConstants.OVSDB_TOPOLOGY_ID));

        return ovsdbTopologyIID;
    }
