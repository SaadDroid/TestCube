public static SnmpInfo load(Configuration configuration) {
        String host = configuration.getSimpleValue(PARAM_HOST, null); // required
        String port = configuration.getSimpleValue(PARAM_PORT, DEFAULT_PORT);
        String oid = configuration.getSimpleValue(PARAM_VARIABLE_BINDING_PREFIX, null); // required
        String trapOid = configuration.getSimpleValue(PARAM_TRAP_OID, null);
        return new SnmpInfo(host, port, oid, trapOid);
    }
