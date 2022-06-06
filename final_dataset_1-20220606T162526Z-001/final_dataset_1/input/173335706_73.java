public boolean existGroupName(String groupName) {
        List<AlertGroup> alertGroup = alertGroupMapper.queryByGroupName(groupName);
        return CollectionUtils.isNotEmpty(alertGroup);
    }
