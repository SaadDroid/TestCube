public Tablet startTablet(HRegionInfo regionInfo,
                            HTableDescriptor tableDescriptor,
                            List<Long> peerList) throws IOException {
    Path basePath = configDirectory.getBaseConfigPath();

    // quorum name - ?
    String quorumName = regionInfo.getRegionNameAsString();

    // write the stuff to disk first:
    configDirectory.writeBinaryData(quorumName, ConfigDirectory.regionInfoFile,
        regionInfo.toByteArray());
    configDirectory.writeBinaryData(quorumName, ConfigDirectory.htableDescriptorFile,
        tableDescriptor.toByteArray());
    configDirectory.writePeersToFile(quorumName, peerList);

    Tablet tablet = tabletFactory.create(
        c5server,
        regionInfo,
        tableDescriptor,
        peerList,
        basePath,
        legacyConf,
        replicationModule,
        regionCreator,
        new UserTabletLeaderBehavior(c5server, regionInfo));
    tablet.setStateChangeChannel(commonStateChangeChannel);
    tablet.start();
    ConcurrentSkipListMap<byte[], Tablet> tablets;
    // This is a new table to this server
    String tableName = TabletNameHelpers.toString(TabletNameHelpers.getClientTableName(regionInfo.getTable()));
    byte[] rowKey;
    if (regionInfo.getEndKey().length == 0) {
      rowKey = new byte[0];
    } else {
      rowKey = regionInfo.getEndKey();
    }

    if (tables.containsKey(tableName)) {
      tablets = tables.get(tableName);
    } else {
      tablets = new ConcurrentSkipListMap<>(new C5Compare());
      tables.put(tableName, tablets);
    }
    Tablet replacement = tablets.put(rowKey, tablet);
    if (replacement != null) {
      LOG.error("We replaced a tablet inadvertently" + replacement.toString());
    }

    return tablet;
  }
