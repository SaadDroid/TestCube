@ApiOperation(value = "getNodeListByDefinitionId", notes = "GET_NODE_LIST_BY_DEFINITION_ID_NOTES")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "processDefinitionId", value = "PROCESS_DEFINITION_ID", required = true, dataType = "Int", example = "100")
    })
    @GetMapping(value = "gen-task-list")
    @ResponseStatus(HttpStatus.OK)
    @ApiException(GET_TASKS_LIST_BY_PROCESS_DEFINITION_ID_ERROR)
    public Result getNodeListByDefinitionId(
            @ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
            @ApiParam(name = "projectName", value = "PROJECT_NAME", required = true) @PathVariable String projectName,
            @RequestParam("processDefinitionId") Integer processDefinitionId) throws Exception {
        logger.info("query task node name list by definitionId, login user:{}, project name:{}, id : {}",
                loginUser.getUserName(), projectName, processDefinitionId);
        Map<String, Object> result = processDefinitionService.getTaskNodeListByDefinitionId(processDefinitionId);
        return returnDataList(result);
    }
