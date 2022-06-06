public Map<String, Object> viewVariables(Integer processInstanceId) {
        Map<String, Object> result = new HashMap<>();

        ProcessInstance processInstance = processInstanceMapper.queryDetailById(processInstanceId);

        if (processInstance == null) {
            throw new RuntimeException("workflow instance is null");
        }

        Map<String, String> timeParams = BusinessTimeUtils
                .getBusinessTime(processInstance.getCmdTypeIfComplement(),
                        processInstance.getScheduleTime());

        String workflowInstanceJson = processInstance.getProcessInstanceJson();

        ProcessData workflowData = JSONUtils.parseObject(workflowInstanceJson, ProcessData.class);

        String userDefinedParams = processInstance.getGlobalParams();

        // global params
        List<Property> globalParams = new ArrayList<>();

        if (userDefinedParams != null && userDefinedParams.length() > 0) {
            globalParams = JSONUtils.toList(userDefinedParams, Property.class);
        }

        List<TaskNode> taskNodeList = workflowData.getTasks();

        // global param string
        String globalParamStr = JSONUtils.toJsonString(globalParams);
        globalParamStr = ParameterUtils.convertParameterPlaceholders(globalParamStr, timeParams);
        globalParams = JSONUtils.toList(globalParamStr, Property.class);
        for (Property property : globalParams) {
            timeParams.put(property.getProp(), property.getValue());
        }

        // local params
        Map<String, Map<String, Object>> localUserDefParams = new HashMap<>();
        for (TaskNode taskNode : taskNodeList) {
            String parameter = taskNode.getParams();
            Map<String, String> map = JSONUtils.toMap(parameter);
            String localParams = map.get(LOCAL_PARAMS);
            if (localParams != null && !localParams.isEmpty()) {
                localParams = ParameterUtils.convertParameterPlaceholders(localParams, timeParams);
                List<Property> localParamsList = JSONUtils.toList(localParams, Property.class);

                Map<String, Object> localParamsMap = new HashMap<>();
                localParamsMap.put("taskType", taskNode.getType());
                localParamsMap.put("localParamsList", localParamsList);
                if (CollectionUtils.isNotEmpty(localParamsList)) {
                    localUserDefParams.put(taskNode.getName(), localParamsMap);
                }
            }

        }

        Map<String, Object> resultMap = new HashMap<>();

        resultMap.put(GLOBAL_PARAMS, globalParams);
        resultMap.put(LOCAL_PARAMS, localUserDefParams);

        result.put(DATA_LIST, resultMap);
        putMsg(result, Status.SUCCESS);
        return result;
    }
