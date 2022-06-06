@Override
    public AMAuditService getAuditService(String realm) {
        AMAuditService auditService = auditServices.get(realm);
        if (auditService == null) {
            return defaultAuditService;
        } else {
            return auditService;
        }
    }
