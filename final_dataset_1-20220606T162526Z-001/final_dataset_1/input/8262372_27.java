public static boolean isSameHdfs(Configuration conf, FileSystem srcFs, FileSystem desFs) {
    // By getCanonicalServiceName, we could make sure both srcFs and desFs
    // show a unified format which contains scheme, host and port.
    String srcServiceName = srcFs.getCanonicalServiceName();
    String desServiceName = desFs.getCanonicalServiceName();

    if (srcServiceName == null || desServiceName == null) {
      return false;
    }
    if (srcServiceName.equals(desServiceName)) {
      return true;
    }
    if (srcFs instanceof DistributedFileSystem && desFs instanceof DistributedFileSystem) {
      //If one serviceName is an HA format while the other is a non-HA format,
      // maybe they refer to the same FileSystem.
      //For example, srcFs is "ha-hdfs://nameservices" and desFs is "hdfs://activeNamenode:port"
      Set<InetSocketAddress> srcAddrs = getNNAddresses((DistributedFileSystem) srcFs, conf);
      Set<InetSocketAddress> desAddrs = getNNAddresses((DistributedFileSystem) desFs, conf);
      if (Sets.intersection(srcAddrs, desAddrs).size() > 0) {
        return true;
      }
    }

    return false;
  }
