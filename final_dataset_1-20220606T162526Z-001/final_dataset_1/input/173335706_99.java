public Map<String, Object> queryTopNLongestRunningProcessInstance(User loginUser, String projectName, int size, String startTime, String endTime) {
        Map<String, Object> result = new HashMap<>();

        Project project = projectMapper.queryByName(projectName);
        Map<String, Object> checkResult = projectService.checkProjectAndAuth(loginUser, project, projectName);
        Status resultEnum = (Status) checkResult.get(Constants.STATUS);
        if (resultEnum != Status.SUCCESS) {
            return checkResult;
        }

        if (0 > size) {
            putMsg(result, Status.NEGTIVE_SIZE_NUMBER_ERROR, size);
            return result;
        }
        if (Objects.isNull(startTime)) {
            putMsg(result, Status.DATA_IS_NULL, Constants.START_TIME);
            return result;
        }
        Date start = DateUtils.stringToDate(startTime);
        if (Objects.isNull(endTime)) {
            putMsg(result, Status.DATA_IS_NULL, Constants.END_TIME);
            return result;
        }
        Date end = DateUtils.stringToDate(endTime);
        if (start == null || end == null) {
            putMsg(result, Status.REQUEST_PARAMS_NOT_VALID_ERROR, "startDate,endDate");
            return result;
        }
        if (start.getTime() > end.getTime()) {
            putMsg(result, Status.START_TIME_BIGGER_THAN_END_TIME_ERROR, startTime, endTime);
            return result;
        }

        List<ProcessInstance> processInstances = processInstanceMapper.queryTopNProcessInstance(size, start, end, ExecutionStatus.SUCCESS);
        result.put(DATA_LIST, processInstances);
        putMsg(result, Status.SUCCESS);
        return result;
    }
