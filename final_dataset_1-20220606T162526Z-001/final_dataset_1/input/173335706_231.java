@ApiOperation(value = "queryResourceListPaging", notes = "QUERY_RESOURCE_LIST_PAGING_NOTES")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "type", value = "RESOURCE_TYPE", required = true, dataType = "ResourceType"),
            @ApiImplicitParam(name = "id", value = "RESOURCE_ID", required = true, dataType = "int"),
            @ApiImplicitParam(name = "searchVal", value = "SEARCH_VAL", dataType = "String"),
            @ApiImplicitParam(name = "pageNo", value = "PAGE_NO", dataType = "Int", example = "1"),
            @ApiImplicitParam(name = "pageSize", value = "PAGE_SIZE", dataType = "Int", example = "20")
    })
    @GetMapping(value = "/list-paging")
    @ResponseStatus(HttpStatus.OK)
    @ApiException(QUERY_RESOURCES_LIST_PAGING)
    public Result queryResourceListPaging(@ApiIgnore @RequestAttribute(value = Constants.SESSION_USER) User loginUser,
                                          @RequestParam(value = "type") ResourceType type,
                                          @RequestParam(value = "id") int id,
                                          @RequestParam("pageNo") Integer pageNo,
                                          @RequestParam(value = "searchVal", required = false) String searchVal,
                                          @RequestParam("pageSize") Integer pageSize
    ) {
        logger.info("query resource list, login user:{}, resource type:{}, search value:{}",
                loginUser.getUserName(), type, searchVal);
        Map<String, Object> result = checkPageParams(pageNo, pageSize);
        if (result.get(Constants.STATUS) != Status.SUCCESS) {
            return returnDataListPaging(result);
        }

        searchVal = ParameterUtils.handleEscapes(searchVal);
        result = resourceService.queryResourceListPaging(loginUser, id, type, searchVal, pageNo, pageSize);
        return returnDataListPaging(result);
    }
