@ApiOperation(value = "updateProject", notes = "UPDATE_PROJECT_NOTES")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "projectId", value = "PROJECT_ID", dataType = "Int", example = "100"),
            @ApiImplicitParam(name = "projectName", value = "PROJECT_NAME", dataType = "String"),
            @ApiImplicitParam(name = "description", value = "PROJECT_DESC", dataType = "String")
    })
    @PostMapping(value = "/update")
    @ResponseStatus(HttpStatus.OK)
    @ApiException(UPDATE_PROJECT_ERROR)
    public Result updateProject(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                @RequestParam("projectId") Integer projectId,
                                @RequestParam("projectName") String projectName,
                                @RequestParam(value = "description", required = false) String description) {
        logger.info("login user {} , updateProcessInstance project name: {}, desc: {}", loginUser.getUserName(), projectName, description);
        Map<String, Object> result = projectService.update(loginUser, projectId, projectName, description);
        return returnDataList(result);
    }
