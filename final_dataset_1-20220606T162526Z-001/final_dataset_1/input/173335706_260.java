@ApiOperation(value = "deleteProcessDefinitionById", notes = "DELETE_PROCESS_DEFINITION_BY_ID_NOTES")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "processDefinitionId", value = "PROCESS_DEFINITION_ID", dataType = "Int", example = "100")
    })
    @GetMapping(value = "/delete")
    @ResponseStatus(HttpStatus.OK)
    @ApiException(DELETE_PROCESS_DEFINE_BY_ID_ERROR)
    public Result deleteProcessDefinitionById(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                              @ApiParam(name = "projectName", value = "PROJECT_NAME", required = true) @PathVariable String projectName,
                                              @RequestParam("processDefinitionId") Integer processDefinitionId
    ) {
        logger.info("delete process definition by id, login user:{}, project name:{}, process definition id:{}",
                loginUser.getUserName(), projectName, processDefinitionId);
        Map<String, Object> result = processDefinitionService.deleteProcessDefinitionById(loginUser, projectName, processDefinitionId);
        return returnDataList(result);
    }
