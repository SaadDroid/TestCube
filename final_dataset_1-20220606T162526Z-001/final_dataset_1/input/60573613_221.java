public void replaceJobNode(final String node, final Object value) {
        coordinatorRegistryCenter.persist(jobNodePath.getFullPath(node), value.toString());
    }
