@Override
    public UserCredentials findByUserId(TenantId tenantId, UUID userId) {
        return DaoUtil.getData(userCredentialsRepository.findByUserId(UUIDConverter.fromTimeUUID(userId)));
    }
