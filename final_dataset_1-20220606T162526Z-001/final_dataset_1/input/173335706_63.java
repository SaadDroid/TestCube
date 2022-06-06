public Map<String, Object> unauthorizedFile(User loginUser, Integer userId) {

        Map<String, Object> result = new HashMap<>();
        if (checkAdmin(loginUser, result)) {
            return result;
        }
        List<Resource> resourceList = resourcesMapper.queryResourceExceptUserId(userId);
        List<Resource> list ;
        if (resourceList != null && resourceList.size() > 0) {
            Set<Resource> resourceSet = new HashSet<>(resourceList);
            List<Resource> authedResourceList = resourcesMapper.queryAuthorizedResourceList(userId);

            getAuthorizedResourceList(resourceSet, authedResourceList);
            list = new ArrayList<>(resourceSet);
        }else {
            list = new ArrayList<>(0);
        }
        Visitor visitor = new ResourceTreeVisitor(list);
        result.put(Constants.DATA_LIST, visitor.visit().getChildren());
        putMsg(result,Status.SUCCESS);
        return result;
    }
