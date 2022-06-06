public void handleMessage(Message message) throws Fault {

        AuthorizationPolicy policy = message.get(AuthorizationPolicy.class);
        if (policy == null || policy.getUserName() == null || policy.getPassword() == null) {
            String name = null;
            if (policy != null) {
                name = policy.getUserName();
            }
            org.apache.cxf.common.i18n.Message errorMsg =
                new org.apache.cxf.common.i18n.Message("NO_USER_PASSWORD",
                                                       BUNDLE,
                                                       name);
            LOG.warning(errorMsg.toString());
            throw new SecurityException(errorMsg.toString());
        }

        try {
            super.validate(message);
        } catch (Exception ex) {
            throw new Fault(ex);
        }
    }
