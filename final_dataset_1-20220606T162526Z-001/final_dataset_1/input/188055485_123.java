@Override
    public CommonResult listAllUsersAndRoles(){
        JSONObject returnJson = new JSONObject();
        List<User> users = userMapper.listAllUsersAndRoles();
        returnJson.put("users", users);
        return CommonResult.success(returnJson);
    }
