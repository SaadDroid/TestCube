@ApiOperation(value = "queryDatabaseState", notes = "QUERY_DATABASE_STATE_NOTES")
    @GetMapping(value = "/database")
    @ResponseStatus(HttpStatus.OK)
    @ApiException(QUERY_DATABASE_STATE_ERROR)
    public Result queryDatabaseState(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser) {
        logger.info("login user: {}, query database state", loginUser.getUserName());
        Map<String, Object> result = monitorService.queryDatabaseState(loginUser);
        return returnDataList(result);
    }
