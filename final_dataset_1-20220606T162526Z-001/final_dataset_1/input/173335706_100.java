public Map<String, Object> queryProcessInstanceById(User loginUser, String projectName, Integer processId) {
        Map<String, Object> result = new HashMap<>();
        Project project = projectMapper.queryByName(projectName);

        Map<String, Object> checkResult = projectService.checkProjectAndAuth(loginUser, project, projectName);
        Status resultEnum = (Status) checkResult.get(Constants.STATUS);
        if (resultEnum != Status.SUCCESS) {
            return checkResult;
        }
        ProcessInstance processInstance = processService.findProcessInstanceDetailById(processId);

        ProcessDefinition processDefinition = processService.findProcessDefineById(processInstance.getProcessDefinitionId());
        processInstance.setReceivers(processDefinition.getReceivers());
        processInstance.setReceiversCc(processDefinition.getReceiversCc());
        result.put(DATA_LIST, processInstance);
        putMsg(result, Status.SUCCESS);

        return result;
    }
