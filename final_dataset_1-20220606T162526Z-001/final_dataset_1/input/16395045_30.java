private boolean isFileClosed(final DistributedFileSystem dfs, final Method m, final Path p) {
    try {
      return (Boolean) m.invoke(dfs, p);
    } catch (SecurityException e) {
      LOG.warn("No access", e);
    } catch (Exception e) {
      LOG.warn("Failed invocation for " + p.toString(), e);
    }
    return false;
  }
