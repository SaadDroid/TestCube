@ApiOperation(value = "queryScheduleList", notes = "QUERY_SCHEDULE_LIST_NOTES")
    @PostMapping("/list")
    @ApiException(QUERY_SCHEDULE_LIST_ERROR)
    public Result queryScheduleList(@ApiIgnore @RequestAttribute(value = SESSION_USER) User loginUser,
                                    @ApiParam(name = "projectName", value = "PROJECT_NAME", required = true) @PathVariable String projectName) {
        logger.info("login user {}, query schedule list, project name: {}",
                loginUser.getUserName(), projectName);
        Map<String, Object> result = schedulerService.queryScheduleList(loginUser, projectName);
        return returnDataList(result);
    }
