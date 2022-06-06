public long getStoreFreeOfDifferentStorageType(String storageType) throws MetaStoreException {
    try {
      int sid = 0;

      if (storageType.equals("ram")) {
        sid = 0;
      }

      if (storageType.equals("ssd")) {
        sid = 1;
      }

      if (storageType.equals("disk")) {
        sid = 2;
      }

      if (storageType.equals("archive")) {
        sid = 3;
      }
      List<DataNodeStorageInfo> lists = dataNodeStorageInfoDao.getBySid(sid);
      long allFree = 0;
      for (DataNodeStorageInfo info : lists) {
        allFree = allFree + info.getRemaining();
      }
      return allFree;
    } catch (Exception e) {
      throw new MetaStoreException(e);
    }
  }
