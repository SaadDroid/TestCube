@Override
    public List<String> selectPermissionsByRoleName(String roleName) {
        return rPermissionRoleExt.selectNameByRoleName(roleName);
    }
