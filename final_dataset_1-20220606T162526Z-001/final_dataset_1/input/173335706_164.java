@ApiOperation(value = "countQueueState", notes = "COUNT_QUEUE_STATE_NOTES")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "projectId", value = "PROJECT_ID", dataType = "Int", example = "100")
    })
    @GetMapping(value = "/queue-count")
    @ResponseStatus(HttpStatus.OK)
    @ApiException(QUEUE_COUNT_ERROR)
    public Result countQueueState(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                  @RequestParam(value = "projectId", required = false, defaultValue = "0") int projectId) {
        logger.info("count command state, user:{}, project id {}",
                loginUser.getUserName(), projectId);
        Map<String, Object> result = dataAnalysisService.countQueueState(loginUser, projectId);
        return returnDataList(result);
    }
