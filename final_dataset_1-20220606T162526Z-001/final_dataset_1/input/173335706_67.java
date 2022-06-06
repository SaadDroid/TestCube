public HashMap<String, Object> queryAlertgroup() {

        HashMap<String, Object> result = new HashMap<>();
        List<AlertGroup> alertGroups = alertGroupMapper.queryAllGroupList();
        result.put(Constants.DATA_LIST, alertGroups);
        putMsg(result, Status.SUCCESS);

        return result;
    }
