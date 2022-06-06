@Transactional(rollbackFor = RuntimeException.class)
    public Map<String, Object> delAlertgroupById(User loginUser, int id) {
        Map<String, Object> result = new HashMap<>();
        result.put(Constants.STATUS, false);

        //only admin can operate
        if (checkAdmin(loginUser, result)){
            return result;
        }
        //check exist
        AlertGroup alertGroup = alertGroupMapper.selectById(id);
        if (alertGroup == null) {
            putMsg(result, Status.ALERT_GROUP_NOT_EXIST);
            return result;
        }

        userAlertGroupService.deleteByAlertGroupId(id);
        alertGroupMapper.deleteById(id);
        putMsg(result, Status.SUCCESS);
        return result;
    }
