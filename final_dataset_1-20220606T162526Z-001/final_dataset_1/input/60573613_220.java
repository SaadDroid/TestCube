public void updateJobNode(final String node, final Object value) {
        coordinatorRegistryCenter.update(jobNodePath.getFullPath(node), value.toString());
    }
