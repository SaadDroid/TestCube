public Map<String,Object> queryDatabaseState(User loginUser) {
    Map<String, Object> result = new HashMap<>();

    List<MonitorRecord> monitorRecordList = monitorDBDao.queryDatabaseState();

    result.put(Constants.DATA_LIST, monitorRecordList);
    putMsg(result, Status.SUCCESS);

    return result;

  }
