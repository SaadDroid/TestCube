@ApiOperation(value = "copyProcessDefinition", notes = "COPY_PROCESS_DEFINITION_NOTES")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "processDefinitionIds", value = "PROCESS_DEFINITION_IDS", required = true, dataType = "String", example = "3,4"),
            @ApiImplicitParam(name = "targetProjectId", value = "TARGET_PROJECT_ID", required = true, type = "Integer")
    })
    @PostMapping(value = "/copy")
    @ResponseStatus(HttpStatus.OK)
    @ApiException(BATCH_COPY_PROCESS_DEFINITION_ERROR)
    public Result copyProcessDefinition(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                        @ApiParam(name = "projectName", value = "PROJECT_NAME", required = true) @PathVariable String projectName,
                                        @RequestParam(value = "processDefinitionIds", required = true) String processDefinitionIds,
                                        @RequestParam(value = "targetProjectId", required = true) int targetProjectId) {
        logger.info("batch copy process definition, login user:{}, project name:{}, process definition ids:{}，target project id:{}",
                StringUtils.replaceNRTtoUnderline(loginUser.getUserName()),
                StringUtils.replaceNRTtoUnderline(projectName),
                StringUtils.replaceNRTtoUnderline(processDefinitionIds),
                StringUtils.replaceNRTtoUnderline(String.valueOf(targetProjectId)));

        return returnDataList(
                processDefinitionService.batchCopyProcessDefinition(loginUser, projectName, processDefinitionIds, targetProjectId));
    }
