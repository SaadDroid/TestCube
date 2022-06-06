@Override
    public TenantAdminItem update(final APIID unusedId, final Map<String, String> attributes) {
        final TenantAdminItem tenantAdminItem = new TenantAdminItem();
        try {
            final boolean doPause = Boolean.parseBoolean(attributes.get(TenantAdminItem.ATTRIBUTE_IS_PAUSED));
            tenantAdminItem.setId(apiSession.getTenantId());
            if (!doPause) {
                getTenantManagementEngineClient().resumeTenant();
            } else if (doPause) {
                getTenantManagementEngineClient().pauseTenant();
            }
            tenantAdminItem.setIsPaused(doPause);
            return tenantAdminItem;
        } catch (final Exception e) {
            throw new APIException(e);
        }
    }
