public long ensureTenantId() throws ServletException {
        long tenantId = parseTenantId(request.getTenantId());
        if(tenantId < 0) {
            return getDefaultTenantId();
        }
        return getRequestedTenantId();
    }
