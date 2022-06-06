@Override
    public Map getAttributes(SSOToken token, IdType type, String name, Set attrNames, String amOrgName, String amsdkDN,
                             boolean isString) throws IdRepoException, SSOException {
        return toLowerCaseKeys(super.getAttributes(token, type, name, attrNames, amOrgName, amsdkDN, isString));
    }
