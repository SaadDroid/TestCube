@Override
    public DeviceCredentials findByDeviceId(TenantId tenantId, UUID deviceId) {
        return DaoUtil.getData(deviceCredentialsRepository.findByDeviceId(UUIDConverter.fromTimeUUID(deviceId)));
    }
