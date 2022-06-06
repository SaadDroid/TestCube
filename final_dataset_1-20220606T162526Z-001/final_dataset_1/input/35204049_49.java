public static ACL parseAcl(String aclString, ACL defaultAcl) {
        if (StringUtils.isEmpty(aclString)) {
            return defaultAcl;
        }
        return parseAcl(aclString);
    }
