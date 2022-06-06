public Integer getItemByExecutionFailoverPath(final String path) {
        if (!isFailoverPath(path)) {
            return null;
        }
        return Integer.parseInt(path.substring(jobNodePath.getFullPath(ExecutionNode.ROOT).length() + 1, path.lastIndexOf(FailoverNode.FAILOVER) - 1));
    }
