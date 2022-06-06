@Override
    public JsonNode addImportSpecialParam(JsonNode taskNode) {
        ObjectNode dependentParameters =  JSONUtils.parseObject(taskNode.path(DEPENDENCE).asText());
        if(dependentParameters != null){
            ArrayNode dependTaskList = (ArrayNode) dependentParameters.path("dependTaskList");
            for (int h = 0; h < dependTaskList.size(); h++) {
                ObjectNode dependentTaskModel = (ObjectNode) dependTaskList.path(h);
                ArrayNode dependItemList = (ArrayNode) dependentTaskModel.get("dependItemList");
                for (int k = 0; k < dependItemList.size(); k++) {
                    ObjectNode dependentItem = (ObjectNode) dependItemList.path(k);
                    Project dependentItemProject = projectMapper.queryByName(dependentItem.path("projectName").asText());
                    if(dependentItemProject != null){
                        ProcessDefinition definition = processDefineMapper.queryByDefineName(dependentItemProject.getId(),dependentItem.path("definitionName").asText());
                        if(definition != null){
                            dependentItem.put("projectId",dependentItemProject.getId());
                            dependentItem.put("definitionId",definition.getId());
                        }
                    }
                }
            }
            ((ObjectNode)taskNode).set(DEPENDENCE, dependentParameters);
        }
        return taskNode;
    }
