@ApiOperation(value = "createProject", notes = "CREATE_PROJECT_NOTES")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "projectName", value = "PROJECT_NAME", dataType = "String"),
            @ApiImplicitParam(name = "description", value = "PROJECT_DESC", dataType = "String")
    })
    @PostMapping(value = "/create")
    @ResponseStatus(HttpStatus.CREATED)
    @ApiException(CREATE_PROJECT_ERROR)
    public Result createProject(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                @RequestParam("projectName") String projectName,
                                @RequestParam(value = "description", required = false) String description) {

        logger.info("login user {}, create project name: {}, desc: {}", loginUser.getUserName(), projectName, description);
        Map<String, Object> result = projectService.createProject(loginUser, projectName, description);
        return returnDataList(result);
    }
