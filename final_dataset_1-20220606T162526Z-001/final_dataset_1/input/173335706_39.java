public Map<String, Object> queryWorkFlowLineageByName(String workFlowName, int projectId) {
        Map<String, Object> result = new HashMap<>(5);
        List<WorkFlowLineage> workFlowLineageList = workFlowLineageMapper.queryByName(workFlowName, projectId);
        result.put(Constants.DATA_LIST, workFlowLineageList);
        putMsg(result, Status.SUCCESS);
        return result;
    }
