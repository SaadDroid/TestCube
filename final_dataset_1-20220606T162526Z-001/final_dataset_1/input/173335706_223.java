@ApiOperation(value = "queryTenantlist", notes = "QUERY_TENANT_LIST_NOTES")
    @GetMapping(value = "/list")
    @ResponseStatus(HttpStatus.OK)
    @ApiException(QUERY_TENANT_LIST_ERROR)
    public Result queryTenantlist(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser) {
        logger.info("login user {}, query tenant list", loginUser.getUserName());
        Map<String, Object> result = tenantService.queryTenantList(loginUser);
        return returnDataList(result);
    }
