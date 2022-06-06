public Map<String, Object> queryDataSourceListPaging(User loginUser, String searchVal, Integer pageNo, Integer pageSize) {
        Map<String, Object> result = new HashMap<>();
        IPage<DataSource> dataSourceList = null;
        Page<DataSource> dataSourcePage = new Page(pageNo, pageSize);

        if (isAdmin(loginUser)) {
            dataSourceList = dataSourceMapper.selectPaging(dataSourcePage, 0, searchVal);
        } else {
            dataSourceList = dataSourceMapper.selectPaging(dataSourcePage, loginUser.getId(), searchVal);
        }

        List<DataSource> dataSources = dataSourceList != null ? dataSourceList.getRecords() : new ArrayList<>();
        handlePasswd(dataSources);
        PageInfo pageInfo = new PageInfo<Resource>(pageNo, pageSize);
        pageInfo.setTotalCount((int) (dataSourceList != null ? dataSourceList.getTotal() : 0L));
        pageInfo.setLists(dataSources);
        result.put(Constants.DATA_LIST, pageInfo);
        putMsg(result, Status.SUCCESS);

        return result;
    }
