protected String getUserIdForAccessOutcome(Response response) {
        String userId = AuditRequestContext.getProperty(AuditConstants.USER_ID);
        return userId == null ? "" : userId;
    }
